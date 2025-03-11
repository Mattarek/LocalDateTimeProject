package FileOperationsRepo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathOperations {
	public static void displayPathInfo(final String filePath) {
		final Path path = Paths.get(filePath);
		System.out.println("Nazwa pliku: " + path.getFileName());
		System.out.println("Ścieżka absollutna: " + path.toAbsolutePath());
		System.out.println("Katalog macierzysty: " + path.getParent());
	}
}
