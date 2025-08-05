package current_2025_lipiec.files.$18IOBuffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
	public static void main(final String[] args) {
		final File input = new File("src/main/java/current_2025_lipiec/files/$18IOBuffered/file.txt");
		final File outputBuffered = new File("src/main/java/current_2025_lipiec/files/$18IOBuffered/file_buffered.txt");
		final File outputUnbuffered = new File("src/main/java/current_2025_lipiec/files/$18IOBuffered/file_unbuffered.txt");
		System.out.println("=== Test: Buffered Copy (1MB) ===");
		final long startBuffered = System.nanoTime();
		CopyWithBuffer.copy(input, outputBuffered);
		final long stopBuffered = System.nanoTime();
		System.out.println("Time with buffering: " + (stopBuffered - startBuffered) / 1_000_000.0);

		final long startWithoutBuffered = System.nanoTime();
		CopyWithoutBuffer.copy(input, outputUnbuffered);
		final long stopWithoutBuffered = System.nanoTime();
		System.out.println("Time without buffering: " + (stopWithoutBuffered - startWithoutBuffered) / 1_000_000.0);
	}

	static class CopyWithBuffer {
		public static void copy(final File inputFile, final File outputFile) {
			try (
					final InputStream input = new BufferedInputStream(new FileInputStream(inputFile));
					final OutputStream output = new BufferedOutputStream(new FileOutputStream(outputFile))
			) {
				final byte[] buffer = new byte[1024];
				int length;
				while ((length = input.read(buffer)) != -1) {
					output.write(buffer, 0, length);
				}
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
	}

	static class CopyWithoutBuffer {
		public static void copy(final File inputFile, final File outputFile) {
			try (
					final InputStream input = new FileInputStream(inputFile);
					final OutputStream output = new FileOutputStream(outputFile)
			) {
				int b;
				while ((b = input.read()) != -1) {
					output.write(b);
				}
			} catch (final IOException e) {
				throw new RuntimeException("Error copying without buffer", e);
			}
		}
	}
}
