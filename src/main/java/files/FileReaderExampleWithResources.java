package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExampleWithResources {
	public static void main(final String[] args) {
		try (final BufferedReader br = new BufferedReader(new FileReader("plik.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
