package FileOperationsRepo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderOperations {
	public static void readFile(final String fileName) {
		try (final FileReader reader = new FileReader(fileName); final BufferedReader bufferedReader = new BufferedReader(reader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
