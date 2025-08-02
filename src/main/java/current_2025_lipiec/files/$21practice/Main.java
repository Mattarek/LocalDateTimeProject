package current_2025_lipiec.files.$21practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
	public static void main(final String[] args) {
		final File inputFile = new File("src/main/java/current_2025_lipiec/files/$21practice/text.txt");
		final List<String> readFile = readFile(inputFile);
		System.out.println(readFile);

		writeFile(readFile);
	}

	private static void writeFile(final List<String> readFiles) {
		try (
				final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java" +
						"/current_2025_lipiec/files/$21practice/outputText.txt", true))
		) {

			for (final String line : readFiles) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	private static List<String> readFile(final File inputFile) {
		final List<String> results = new ArrayList<>();
		try (
				final BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))
		) {
			String line = bufferedReader.readLine();
			while (Objects.nonNull(line)) {
				results.add(line);
				line = bufferedReader.readLine();
			}
			return results;
		} catch (final Exception e) {
			e.printStackTrace();
			return results;
		}
	}
}
