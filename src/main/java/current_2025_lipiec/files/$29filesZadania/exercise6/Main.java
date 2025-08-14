package current_2025_lipiec.files.$29filesZadania.exercise6;

import java.io.File;
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
		final String list = convertFileTextToUppercase(path);
		final String list2 = convertFileTextToUppercase2(path);
		//		System.out.println(list);
		System.out.println(list2);
	}

	// sposób nr.1
	private static String convertFileTextToUppercase(final Path path) throws IOException {
		final List<String> lineList = Files.readAllLines(path);
		final List<String> list = new ArrayList<>();
		for (final String s : lineList) {
			list.add(s.toUpperCase());
		}

		return String.join("", list);
	}

	private static String convertFileTextToUppercase2(final Path path) throws IOException {
		try (final Stream<String> list = Files.lines(path)) {
			return String.join("", list.map(String::toUpperCase).toList());
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
