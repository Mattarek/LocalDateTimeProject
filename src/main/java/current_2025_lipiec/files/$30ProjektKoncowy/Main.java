package current_2025_lipiec.files.$30ProjektKoncowy;

import current_2025_lipiec.files.$30ProjektKoncowy.domain.Pair;
import current_2025_lipiec.files.$30ProjektKoncowy.domain.Purchase;
import current_2025_lipiec.files.$30ProjektKoncowy.services.FileService;
import current_2025_lipiec.files.$30ProjektKoncowy.services.PurchesMappingService;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
	public static final String EX_2 = "./src/main/java/current_2025_lipiec/files/$30ProjektKoncowy/ex2/";
	public static final String EX_3 = "./src/main/java/current_2025_lipiec/files/$30ProjektKoncowy/ex3/";
	public static final String EX_4 = "./src/main/java/current_2025_lipiec/files/$30ProjektKoncowy/ex4/";

	static void main() {

		final Path path = Paths.get("./src/main/java/current_2025_lipiec/files/$30ProjektKoncowy/resources/client-car-purchase-spreadsheet.csv");
		final List<Purchase> purchaseList = FileService.loadData(path);

		final Map<String, List<Purchase>> mapByCompany = purchaseList.stream()
				.collect(Collectors.groupingBy(p -> p.car().company()));

		final Map<String, Map<String, List<Purchase>>> mapByCompanyAndModel = mapByCompany.entrySet().stream()
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						e -> e.getValue().stream()
								.collect(Collectors.groupingBy(p -> p.car().model()))
				));

		final Map<String, Map<String, Pair<BigDecimal, Long>>> ex3ReportMap = mapByCompanyAndModel.entrySet().stream()
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						e -> e.getValue()
								.entrySet()
								.stream()
								.collect(Collectors.toMap(
										Map.Entry::getKey,
										e1 -> buildPair(e1.getValue())
								))
				));

		final AtomicInteger counter = new AtomicInteger(1);
		final List<String> ex3ReportData = ex3ReportMap.entrySet().stream()
				.flatMap(eExternal -> eExternal.getValue().entrySet().stream()
						.map(
								eInternal -> getRawRow(counter.getAndIncrement(), eExternal.getKey(), eInternal.getKey(), eInternal.getValue()))
				)
				.toList();

		// EX4
		final TreeMap<LocalDate, Long> mapByDate = purchaseList.stream().collect(Collectors.groupingBy(
						Purchase::date,
						TreeMap::new,
						Collectors.counting()
				)
		);

		final AtomicInteger counterex4 = new AtomicInteger(1);
		final List<String> dataByDate = mapByDate.entrySet().stream()
				.map(e -> String.format("%s, %s, %s,", counterex4.getAndIncrement(), e.getKey(), e.getValue()))
				.toList();

		final List<String> dataByCount =
				mapByDate.entrySet().stream()
						.map(e -> new Pair<>(e.getValue(), e.getKey()))
						.sorted(Comparator.comparing(Pair::t))
						.map(p -> String.format("%s, %s, %s,", counterex4.getAndIncrement(), p.u(), p.t()))
						.toList();
		generateEx4Report(dataByCount, "byDate");

		//		generateEx3Report(ex3ReportData);
		//		createFilesGroupedByCompany(mapByCompany);
		//		printSortedByCompany();
	}

	private static void generateEx4Report(final List<String> data, final String suffix) {
		final Path path = Paths.get(EX_4 + suffix + "report.csv");
		FileService.saveToFile(path, data, "id,company,model");
	}

	private static void generateEx3Report(final List<String> ex3ReportData) {
		final Path path = Paths.get(EX_3 + "report.csv");
		FileService.saveToFile(path, ex3ReportData, "id, company, model, average_price, count");
	}

	private static String getRawRow(final int counter, final String company, final String model, final Pair<BigDecimal, Long> pair) {
		return String.format("%s,%s,%s,%s,%s", counter, company, model, pair.t(), pair.u());
	}

	private static Pair<BigDecimal, Long> buildPair(final List<Purchase> purchaseList) {
		final long count = purchaseList.size();
		final BigDecimal averagePrice = purchaseList.stream()
				.map(purchase -> purchase.car().price())
				.reduce(BigDecimal.ZERO,
						BigDecimal::add)
				.divide(BigDecimal.valueOf(count), 2, RoundingMode.HALF_UP);

		return new Pair<>(averagePrice, count);
	}

	private static void createFilesGroupedByCompany(final Map<String, List<Purchase>> mapByCompany) {
		for (final Map.Entry<String, List<Purchase>> entry : mapByCompany.entrySet()) {
			final Path pathExported =
					Paths.get(EX_2 + "/purchasesOf-of-" + entry.getKey() + ".csv");

			final List<String> data = entry.getValue().stream()
					.map(PurchesMappingService::toCSV)
					.toList();
			FileService.saveToFile(pathExported, data);
		}
	}

	private static Number getFileSize(final Path path1) {
		try {
			return Files.size(path1);
		} catch (final IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	private static void printSortedByCompany() {
		try {
			final TreeMap<Path, ? extends Number> mapSizeByCompany = Files.list(Paths.get(EX_2))
					.collect(Collectors.toMap(
							Path::getFileName,
							Main::getFileSize,
							(a, b) -> a, TreeMap::new));

			for (final Path path1 : mapSizeByCompany.keySet()) {
				System.out.printf("%s:%s%n", path1, mapSizeByCompany.get(path1));
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
