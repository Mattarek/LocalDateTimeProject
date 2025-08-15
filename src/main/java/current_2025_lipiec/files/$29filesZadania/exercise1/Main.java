package current_2025_lipiec.files.$29filesZadania.exercise1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
	// 1. Znajdź i wypisz na ekranie wszystkie pliki, które znajdują się w podanej przez Ciebie ścieżce oraz
	// mają rozszerzenie zgodne z podanym przez Ciebie rozszerzeniem. Uwzględnik wszystkie piliki w katalogach
	// zagnieżdzonych.

	// Zaznacze, że w zadaniu umieściliśmy pewein easter egg. Zadanie to może zostaćrozwiązane przy wykorzystaniu
	// metody Files.walk(), która nie została poruszona w materiałach.

	// Żeby nie psuć sobie zabawy,spróbuj najpierw rozwiązac to zagadnienei samodzielnie, krorzysając z metod
	// poruszonych w materialach - bez uzywa metody FIles.walk();

	//
	static void main() {
		final Path path = Paths.get("src/main/java/current_2025_lipiec/files/$29filesZadania/exercise1");
		//		listFilesRecursive(path);
		listFilesWalk(path);
	}

	static void listFilesRecursive(final Path dir) {
		try (final Stream<Path> stream = Files.list(dir)) {
			stream.forEach(path -> {
				System.out.println(path);
				if (Files.isDirectory(path)) {
					listFilesRecursive(path);
				}
			});
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	static void listFilesWalk(final Path path) {
		try {
			Files.walk(path).filter(p -> Files.isRegularFile(p)).forEach(System.out::println);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
