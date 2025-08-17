package current_2025_lipiec.files.$30ProjektKoncowy;

import current_2025_lipiec.files.$30ProjektKoncowy.domain.Purchase;
import current_2025_lipiec.files.$30ProjektKoncowy.services.FileService;
import current_2025_lipiec.files.$30ProjektKoncowy.services.PurchesMappingService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
	public static final String EX_2 = "./src/main/java/current_2025_lipiec/files/$30ProjektKoncowy/ex2/";

	static void main() {

		final Path path = Paths.get("./src/main/java/current_2025_lipiec/files/$30ProjektKoncowy/resources/client-car-purchase-spreadsheet.csv");
		final List<Purchase> purchaseList = FileService.loadData(path);

		final Map<String, List<Purchase>> mapByCompany = purchaseList.stream()
				.collect(Collectors.groupingBy(p -> p.car().company()));

		printSortedByCompany();
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
