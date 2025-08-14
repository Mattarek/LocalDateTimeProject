package current_2025_lipiec.files.$29filesZadania.exercise6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	// 6. Napisz program, który zastąpi zawartość pliku tym samym tekstem ale w całości napisanym z wielkiej litery.
	// Do wygenerowania zawartości pliku wykorzystać: httpd://pl.lipsum.com
	static void main() throws IOException {
		final Path path = Paths.get("src/main/java/current_2025_lipiec/files/$29filesZadania/exercise6/text.txt");
		final Path path2 = Paths.get("src/main/java/current_2025_lipiec/files/$29filesZadania/exercise6/text2.txt");
		final String list = convertFileTextToUppercase(path, path2);
		System.out.println(list);
	}

	// sposób nr.1
	private static String convertFileTextToUppercase(final Path path, final Path path2) throws IOException {
		final List<String> stringsList;

		try (final Stream<String> lineList = Files.lines(path)) {
			stringsList = lineList
					.map(String::toUpperCase)
					.toList();
		}

		try (final BufferedWriter writer = Files.newBufferedWriter(path2)) {
			for (final String line : stringsList) {
				writer.write(line);
				writer.newLine();
			}
		}

		return String.join("", stringsList);
	}
}
