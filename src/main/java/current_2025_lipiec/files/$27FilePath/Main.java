package current_2025_lipiec.files.$27FilePath;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	static void main(final String[] args) {
		final File file = new File("src/main/java/current_2025_lipiec/files/$27FilePath/textFile.txt");
		final Path path = Paths.get("src/main/java/current_2025_lipiec/files/$27FilePath/testPath.txt");

		final Path filePath = file.toPath(); // zamiana File na Path
		final File pathFile = path.toFile(); // zamiana Path na File
		final FileSystem fileSystem = FileSystems.getDefault();
		System.out.println(fileSystem);

		// Ścieżki absolutne
		final Path path1 = Paths.get("/home/marcin/projekty/java");
		final Path path2 = Paths.get("/home/marcin/dokumenty/raport.txt");

		// Obliczamy jak dojść z path1 do path2
		final Path relativePath = path1.relativize(path2);

		System.out.println("path1: " + path1);
		System.out.println("path2: " + path2);
		System.out.println("Ścieżka względna z path1 do path2: " + relativePath);

		try {
			System.out.println(file.createNewFile());
		} catch (final Exception e) {
			e.printStackTrace();
		}
		System.out.println(path.getNameCount());
		System.out.println(path.toAbsolutePath());
		System.out.println("toFile: " + path.toFile());
		System.out.println(path.getNameCount());

		try {
			System.out.println(
					Paths.get(".").toRealPath()
			);
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}
	}
}
