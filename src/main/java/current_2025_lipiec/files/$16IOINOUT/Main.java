package current_2025_lipiec.files.$16IOINOUT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args) {
		// tworzymy zmienną która przechowuje ścieżkę do naszego pliku
		final File input = new File("src/main/java/current_2025_lipiec/files/$16IOINOUT/file.txt");
		final File outputFile = new File("src/main/java/current_2025_lipiec/files/$16IOINOUT/file2.txt");

		final File inputPhoto = new File("src/main/java/current_2025_lipiec/files/$16IOINOUT/photo.png");
		final File outputPhoto = new File("src/main/java/current_2025_lipiec/files/$16IOINOUT/photo2.png");
		justCopyNoBuffer(input, outputFile, inputPhoto, outputPhoto);
		final byte[] bytes = "ą".getBytes(StandardCharsets.UTF_8);
		System.out.println(Arrays.toString(bytes)); // -60 -123
	}

	private static void justCopyNoBuffer(final File inputFile, final File outputFile, final File inputPhoto,
										 final File outputPhoto) {
		try (
				// Czytamy i zapisujemy pojedynczo bajt po bajcie, bez bufferowania
				final InputStream input = new FileInputStream(inputFile);
				final OutputStream output = new FileOutputStream(outputFile)
		) {
			System.out.printf("Start reading file: [%s]%n", inputFile);
			int value = input.read();
			System.out.printf("Reading value: [%s], char [%s]%n", value, (char) value);

			while (value != -1) {
				System.out.printf("Writing vlaue: [%s], char: [%s]%n", value, (char) value);
				output.write(value);
				value = input.read();
				System.out.printf("Reading value: [%s], char [%s]%n", value, (char) value);
			}
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
		try (
				// Czytamy i zapisujemy pojedynczo bajt po bajcie, bez bufferowania
				final InputStream input = new FileInputStream(inputPhoto);
				final OutputStream output = new FileOutputStream(outputPhoto)
		) {
			int value = input.read();

			while (value != -1) {
				output.write(value);
				value = input.read();
			}
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
	}
}
