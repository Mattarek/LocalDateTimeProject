package current_2025_lipiec.files.$29filesZadania.exercise7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
	// 7. Napisz program, który zliczy ilość słów występujących w pliku. Do wygenerowania zawartości pliku
	// wykorzystaj pl.lipsum.com
	static void main() {
		final Path path = Paths.get("src/main/java/current_2025_lipiec/files/$29filesZadania/exercise7/text.txt");
		print(path);
	}

	private static void print(final Path path) {
		try {
			final long wordsCount = Files.lines(path)
					.flatMap(line -> Stream.of(line.split(" ")))
					.count();
			System.out.printf("File %s has a total number of %s words.", path.getFileName(), wordsCount);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
