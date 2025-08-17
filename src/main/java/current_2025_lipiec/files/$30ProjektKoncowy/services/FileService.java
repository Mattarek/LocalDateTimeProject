package current_2025_lipiec.files.$30ProjektKoncowy.services;

import current_2025_lipiec.files.$30ProjektKoncowy.domain.Purchase;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	public static List<Purchase> loadData(final Path path) {
		final List<Purchase> list = new ArrayList<>();

		try {
			return Files.lines(path, Charset.defaultCharset())
					.skip(1)
					.map(PurchesMappingService::myPurcahse)
					.toList();
		} catch (final IOException e) {
			e.printStackTrace();
		}

		return list;
	}

	public static void saveToFile(final Path path, final List<String> data) {
		final String header = "id,first_name,last_name,email,ip_address,color,car_vin,car_company,car_model,car_model_year," +
				"car_price,country,city,date";
		saveToFile(path, data, header);
	}

	public static void saveToFile(final Path path, final List<String> data, final String header) {
		try {
			Files.createDirectories(path.subpath(0, path.getNameCount() - 1));
		} catch (final IOException e) {
			e.printStackTrace();
		}

		try (final BufferedWriter writer = Files.newBufferedWriter(path, Charset.defaultCharset())) {
			writer.write(header);
			writer.newLine();
			for (final String row : data) {
				writer.write(row);
				writer.newLine();
				writer.flush();
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
