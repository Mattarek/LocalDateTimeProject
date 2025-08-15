package current_2025_lipiec.files.$29filesZadania.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	// 5. Napisz program, który znajdzie drugie najdłuższe słowo i drugi słowo o długości 3 w podanym przez Ciebie
	// pliku. Do wygenerowania zawartości pliku wykorzystać httpd://p.lipsum.com/

	static void main() throws IOException {
		final Path path = Paths.get("src/main/java/current_2025_lipiec/files/$29filesZadania/exercise5/lorem.txt");
		printSpecificWords(path);
	}

	private static void printSpecificWords(final Path path) throws IOException {
		final Map<Integer, List<String>> words = Files.lines(path)
				.map(line -> line.replace(".", "").replace(",", ""))
				.flatMap(line -> Stream.of(line.split(" ")))
				.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
		final Integer maxLength =
				words.keySet().stream().max(Comparator.comparingInt(a -> a)).orElse(0);
		System.out.println(words.get(maxLength));
	}
}
