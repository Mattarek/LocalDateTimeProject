package current_2025_lipiec.files.$26InterfacePath;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(final String[] args) {
		// Uniform Resource Identifier
		//		final Path path = Paths.get("src/main/java/current_2025_lipiec/files/$26InterfacePath/myFile.txt");
		//		System.out.println(Files.exists(path));
		//
		//		final FileSystem fileSystem = FileSystems.getDefault();
		//		fileSystem.getPath("src/main/java/current_2025_lipiec/files/$26InterfacePath/myFile.txt");
		//		System.out.println(fileSystem);

		//=============================
		final Path path = Paths.get("src/main/java/current_2025_lipiec/files/$26InterfacePath/myFile.txt");
		final int length = path.getNameCount();
		System.out.println(length);

		final Path parent = path.getParent();
		System.out.println(parent);

		final Path root = path.getRoot();
		System.out.println(root);

		final FileSystem fileSystem = path.getFileSystem();
		System.out.println(fileSystem);

		final URI uri = path.toUri();
		System.out.println(uri);

		final Path file = path.getName(3);
		System.out.println(file);

		final Boolean isAbsolute = path.isAbsolute();
		System.out.println(isAbsolute);

		final Path obj = path.toAbsolutePath();
		System.out.println(obj);

		//===========================================
		final Path paths = Paths.get("zajavka/myFolder/myFile");
		final Path paths2 = Paths.get("zajavka/");
		System.out.println(paths.toAbsolutePath()); // C:\Users\marb6\Desktop\Projekty_java\2025\Praktyka\EQ\zajavka\myFolder\myFile

		final Path res = path.subpath(1, 6).toAbsolutePath();
		paths.relativize(paths2);
		System.out.println(res);
	}
}
