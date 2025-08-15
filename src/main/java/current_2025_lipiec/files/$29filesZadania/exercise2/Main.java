package current_2025_lipiec.files.$29filesZadania.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	// 2. Wypisz na ekranie ścieżki wszystkich plików które został znalezione w podanej przez Ciebie ścieżce.
	// Uzwględnij tylko te pliki tekstowe, które zawierają w swojej treści słowo zajavka. Dodaj możliwość podania
	// rozszerzeń plików do pominięcia, gdyż niektóre z nich, np. .docs powodują błędy przy odczycie. Uwzględnij
	// wszystkie pliki w katallogach zagnieżdzonych.

	static void main() {
		final Path rootPath = Paths.get("src/main/java/current_2025_lipiec/files/$29filesZadania/exercise2");
		final String searchedWord = "f";
		final List<String> prohibitedExtensions = List.of(".docx", ".pdf", ".java");

		printSpecificPaths(rootPath, searchedWord, prohibitedExtensions);
	}

	private static void printSpecificPaths(final Path rootPath, final String searchedWord, final List<String> prohibitedExtensions) {
		try (final Stream<Path> allPaths = Files.walk(rootPath).filter(Files::isRegularFile)) {

			final Stream<Path> onlyPermittedFilesPaths =
					allPaths.filter(path -> !prohibitedExtensions.contains(getPathExtension(path)));

			onlyPermittedFilesPaths.filter(path -> {
				System.out.println(path);
				try {
					return Files.lines(path).anyMatch(line -> line.contains(searchedWord));
				} catch (final IOException e) {
					e.printStackTrace();
					return false;
				}
			}).forEach(System.out::println);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private static String getPathExtension(final Path path) {
		final String fileName = path.getFileName().toString();
		final int i = fileName.lastIndexOf('.'); // pliki mogą mieć kropke w nazwie
		if (i == -1) {

			return fileName;
		}
		return fileName.substring(i);
	}
}
