package old_2024.FileOperationsRepo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesOperations {
	public static void writeFile(final String fileName, final String content) {
		try {
			Files.write(Paths.get(fileName), content.getBytes());
			System.out.println("Dane zapisane do pliku za pomocą Files.");
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile(final String fileName) {
		try {
			final List<String> lines = Files.readAllLines(Paths.get(fileName));
			lines.forEach(System.out::println);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
