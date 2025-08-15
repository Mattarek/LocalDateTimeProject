package current_2025_lipiec.files.$28FilePathsClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	static void main() throws IOException {
		//==============================================================================================
		//		final Path path = Paths.get(".").toRealPath();
		//		System.out.println(Files.exists(path));
		//		System.out.println(path);
		//
		//		final Path pathToFile = Paths.get("src/main/java/current_2025_lipiec/files/$28FilePathsClass/text.txt");
		//		final Path pathToFileMove = Paths.get("src/main/java/current_2025_lipiec/files/$28FilePathsClass/textMove.txt");
		//		final Path pathToFileMoveAfter = Paths.get("src/main/java/current_2025_lipiec/files/$28FilePathsClass" +
		//				"/textMoveAfter" +
		//				".txt");
		//		final Path pathToFile2 = Paths.get("src/main/java/current_2025_lipiec/files/$28FilePathsClass/directory" +
		//				"/directory2/directory3/text2.txt");
		//		final Path pathToDirectory = Paths.get("src/main/java/current_2025_lipiec/files/$28FilePathsClass/directory" +
		//				"/directory2/directory3/");
		//		System.out.println(Files.exists(pathToFile));
		//
		//		try {
		//			//			Files.createDirectories(pathToDirectory);
		//			//			System.out.println(Files.copy(pathToFile, pathToFile2));
		//			//			Files.copy(pathToFile, pathToFileMove);
		//			//			Files.move(pathToFileMove, pathToFileMoveAfter);
		//			//			Files.exists(pathToFileMove);
		//			//			final boolean isDeleted = Files.deleteIfExists(pathToFileMove);
		//			//			System.out.println(isDeleted);
		//
		//			System.out.println(Files.readAllLines(pathToFile));
		//			final List a = Files.readAllLines(pathToFile);
		//			a.stream().forEach(System.out::println);
		//		} catch (final IOException e) {
		//			e.printStackTrace();
		//		}
		//==============================================================================================
		final Path readingPath = Paths.get("src/main/java/current_2025_lipiec/files/$28FilePathsClass/text.txt");
		try (final BufferedReader reader = Files.newBufferedReader(readingPath)) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("Line: " + line);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}

		final Path writingPath = Paths.get("src/main/java/current_2025_lipiec/files/$28FilePathsClass/textFileWriter" +
				".txt");
		try (final BufferedWriter writer = Files.newBufferedWriter(writingPath)) {
			writer.newLine();
			writer.write("zajavka2");
			writer.flush();
		} catch (final IOException e) {
			e.printStackTrace();
		}

		System.out.println(Files.getLastModifiedTime(readingPath));
		System.out.println(Files.size(readingPath));
		System.out.println(Files.isDirectory(readingPath));
		System.out.println(Files.isReadable(readingPath));

		Files.createFile(Paths.get("src/main/java/current_2025_lipiec/files/$28FilePathsClass/createfile.txt"));
	}
}
