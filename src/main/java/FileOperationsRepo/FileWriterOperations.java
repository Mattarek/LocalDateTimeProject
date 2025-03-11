package FileOperationsRepo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOperations {
	public static void writeFile(final String fileName, final String content) {
		try (final FileWriter writer = new FileWriter(fileName)) {
			writer.write(content);
			System.out.println("Dane zapisane do pliku za pomocą FileWriter.");
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
