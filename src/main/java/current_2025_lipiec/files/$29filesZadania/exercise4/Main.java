package current_2025_lipiec.files.$29filesZadania.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	// 4. Napisz program, który w podanym przez Ciebie katalogu znadzie dowolny plik, z najstarszą i najmłodszą datą
	// modyfikacji. Przeszukaj wszystkie pliki w katalogu, również zagłebione.

	static void main() throws IOException {
		final Path path = Paths.get("src/main/java/current_2025_lipiec/files/$29filesZadania/exercise4");
		printOldestNewset(path);
	}

	private static FileTime printOldestNewset(final Path path) throws IOException {
		try (final Stream<Path> files = Files.walk(path)) {

			// Musi tu być try...catch bo jest w lambdzie
			final List<Path> filesList = files
					.filter(Files::isRegularFile)
					.sorted(Comparator.comparing(Main::getFileTime)
					).toList();

			if (!filesList.isEmpty()) {
				System.out.println("Newest: " + filesList.get(filesList.size() - 1));
				System.out.println("Oldest: " + filesList.get(0));
				return FileTime.fromMillis(0);
			}
			System.out.println("Files not found!");
		} catch (final IOException e) {
			e.printStackTrace();
			return FileTime.fromMillis(0);
		}
		return null;
	}

	private static FileTime getFileTime(final Path e) {
		try {
			return Files.getLastModifiedTime(e);
		} catch (final IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
