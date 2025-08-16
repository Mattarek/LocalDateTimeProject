package current_2025_lipiec.files.$30ProjektKoncowy.services;

import current_2025_lipiec.files.$30ProjektKoncowy.domain.Purchase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileService {
	public static List<Purchase> loadData(final Path path) {
		try {
			Files.lines(path)
					.skip(1)
					.map(PurchesMappingService::myPurcahse);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
