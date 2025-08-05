package current_2025_lipiec.files.$20ReadWriteString;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(final String[] args) {
		final File inputFile = new File("src/main/java/current_2025_lipiec/files/$20ReadWriteString/file.txt");
		final File outputFile = new File("src/main/java/current_2025_lipiec/files/$20ReadWriteString/fileOutput.txt");
		final List<String> fileRead = readFile(inputFile, outputFile);
		fileRead.stream().forEach(System.out::println);
		writeFile(outputFile, fileRead);
	}

	private static void writeFile(final File outputFile, final List<String> fileRead) {
		System.out.println(fileRead);
		try (final BufferedWriter writer =
					 new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8, true))) {
			for (final String line : fileRead) {
				writer.write(line);
				writer.newLine();
			}
		} catch (final IOException e) {
		}
	}

	public static List<String> readFile(final File inputFile, final File outputFile) {
		final List<String> result = new ArrayList<>();
		try (
				final BufferedReader reader = new BufferedReader(
						new FileReader(inputFile, StandardCharsets.UTF_8));
				final BufferedWriter writer = new BufferedWriter(
						new FileWriter(outputFile))

		) {

			String line = reader.readLine();

			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}