package FileOperationsRepo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
	// Tworzenie nowego pliku
	public static void createFile(final String fileName) {
		final File file = new File(fileName);
		try {
			if (file.createNewFile()) {
				System.out.println("Plik utworzony: " + file.getAbsolutePath());
			} else {
				System.out.println("Plik już istnieje.");
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	// Usuwanie pliku
	public static void deleteFile(final String fileName) {
		final File file = new File(fileName);
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("Plik usunięty.");
			} else {
				System.out.println("Nie udało się usunąć pliku.");
			}
		} else {
			System.out.println("Plik nie istnieje.");
		}
	}

	// Zapisywanie do pliku za pomocą PrintWriter
	public static void writeFile(final String fileName, final String content) {
		try (final PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
			writer.println(content);
			System.out.println("Zapisano do pliku.");
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	// Odczyt pliku za pomocą BufferedReader
	public static void readFile(final String fileName) {
		try (final BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	// Odczyt pliku za pomocą klasy Scanner
	public static void readFileWithScanner(final String fileName) {
		try (final Scanner scanner = new Scanner(new File(fileName))) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	// Tworzenie katalogu
	public static void createDirectory(final String dirName) {
		final File dir = new File(dirName);
		if (!dir.exists()) {
			if (dir.mkdir()) {
				System.out.println("Katalog utworzony: " + dir.getAbsolutePath());
			} else {
				System.out.println("Nie udało się utworzyć katalogu.");
			}
		} else {
			System.out.println("Katalog już istnieje.");
		}
	}

	// Zapisywanie pliku za pomocą Files
	public static void writeFileNIO(final String fileName, final String content) {
		try {
			Files.write(Paths.get(fileName), content.getBytes());
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	// Odczyt pliku za pomocą Files
	public static void readFileNIO(final String fileName) {
		try {
			final List<String> lines = Files.readAllLines(Paths.get(fileName));
			lines.forEach(System.out::println);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	// Kopiowanie pliku
	public static void copyFile(final String source, final String destination) {
		try {
			Files.copy(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Plik skopiowany do: " + destination);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	// Usuwanie pliku za pomocą Files
	public static void deleteFileNIO(final String fileName) {
		try {
			Files.deleteIfExists(Paths.get(fileName));
			System.out.println("Plik został usunięty za pomocą Files.");
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(final String[] args) {
		final String filePath = "example.txt";
		final String directoryPath = "sample-directory";
		final String copyPath = "copy_example.txt";

		createFile(filePath);
		writeFile(filePath, "To jest testowy plik.");
		readFile(filePath);
		readFileWithScanner(filePath);
		createDirectory(directoryPath);
		writeFileNIO(filePath, "To jest zapisane metodą NIO.");
		readFileNIO(filePath);
		copyFile(filePath, copyPath);
		deleteFileNIO(copyPath);
		deleteFile(filePath);
	}
}
