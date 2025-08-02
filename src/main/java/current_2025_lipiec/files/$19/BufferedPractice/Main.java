package current_2025_lipiec.files.$19.BufferedPractice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final File inputFile = new File("./src/main/java/current_2025_lipiec/files/$19/BufferedPractice/text1" +
				".txt");
		final File outputFile = new File("./src/main/java/current_2025_lipiec/files/$19/BufferedPractice" +
				"/text2.txt");

		try (final InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputFile));
			 final OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFile))
		) {
			final byte[] buffer = new byte[1024]; // oczytujemy 1024 bajtow
			byte[] readBytes = bufferedInputStream.readNBytes(16);
			while (readBytes.length > 0) {
				// buffer - wielkość chunkow jakie chcemy na raz przenosić
				// offset - ile bajtow od początku chcemy pominąć
				// length - ilosc odczytanych bajtow
				bufferedOutputStream.write(readBytes);
				bufferedOutputStream.flush();
				readBytes = bufferedInputStream.readNBytes(16);
				System.out.println("Read: " + Arrays.toString(readBytes) + ", num of bytes read: " + readBytes.length);
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
