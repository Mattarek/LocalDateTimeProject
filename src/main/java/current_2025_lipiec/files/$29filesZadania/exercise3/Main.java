package current_2025_lipiec.files.$29filesZadania.exercise3;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	// 3. Napisz program, który na podstawie podanego pliku wydrukuje jego rozmiar w bajtach, kb, mb.
	static void main() {
		final Path path = Paths.get("src/main/java/current_2025_lipiec/files/$29filesZadania/exercise3/someFile.txt");
		printFileSize(path);
	}

	private static void printFileSize(final Path path) {
		try {
			final long sizeInBytes = Files.size(path);
			final BigDecimal sizeInKb = BigDecimal.valueOf(sizeInBytes).divide(BigDecimal.valueOf(1024), RoundingMode.HALF_UP);
			final BigDecimal sizeInMB = sizeInKb.divide(BigDecimal.valueOf(1024), RoundingMode.HALF_UP);
			System.out.printf(
					"File %s has size of %sB / %s KB / %s MB.",
					path.getFileName(),
					sizeInBytes,
					sizeInKb,
					sizeInMB
			);
		} catch (final IOException e) {
		}
		System.out.println();
	}
}
