package old_2024.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LargeFileExample {
	public static void main(final String[] args) {
		final String inputFilePath = "largeFile.txt";
		final String outputFilePath = "output.txt";

		final File largeFile = new File(inputFilePath);
		final File output = new File(outputFilePath);

		try {
			if (output.createNewFile()) {
				System.out.println("Utworzony plik: output.txt");
			}
			if (largeFile.createNewFile()) {
				System.out.println("Utworzony plik: largeFile.txt");
			}
			final FileWriter outputWriter = new FileWriter("output.txt");
			outputWriter.write("qwe\n");
			outputWriter.write("qwe\n");
			outputWriter.write("qwe\n");
			outputWriter.write("qwe\n");
			outputWriter.write("qwe\n");
			outputWriter.write("qwe\n");
		} catch (final IOException e) {
			e.printStackTrace();
		}

		try (
				final BufferedReader reader = new BufferedReader(new FileReader("largefile.txt"));
				final BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
		) {

			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line.toUpperCase());
				writer.newLine();
			}
			System.out.println("Przetwarzanie zakończone.");
		} catch (final IOException e) {
			System.out.println("Wystąpił błąd podczas przetwarzania pliku.");
			e.printStackTrace();
		}
	}
}
