package current_2025_lipiec.files.$30ProjektKoncowy.services;

import current_2025_lipiec.files.$30ProjektKoncowy.domain.Purchase;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileService {
	public static List<Purchase> loadData(final Path path) {
		try {
			final List<Purchase> list = Files.lines(path, Charset.defaultCharset())
					.skip(1)
					.map(PurchesMappingService::myPurcahse)
					.toList();
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
