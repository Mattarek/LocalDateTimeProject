package old_2024.WorkingWithFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
	public static void main(final String[] args) {
		final Path path = Paths.get("example.txt");

		System.out.println("Nazwa pliku: " + path.getFileName());
		System.out.println("Ścieżka absolutna: " + path.toAbsolutePath());
		System.out.println("Katalog macierzysty: " + path.getParent());
	}
}
