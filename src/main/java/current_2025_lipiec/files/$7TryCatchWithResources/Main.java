package current_2025_lipiec.files.$7TryCatchWithResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(final String[] args) throws IOException {
		example(Paths.get("someFile.txt"), Paths.get("someNewFile.txt"));
	}

	public static void example(final Path path1, final Path path2) throws IOException {
		// Zwykly try...catch
		try {
			final BufferedReader in = Files.newBufferedReader(path1);
			final BufferedWriter out = Files.newBufferedWriter(path2);
			final String line = in.readLine() + "tryCatch";
			System.out.println(line);
		} catch (final IOException e) {
			e.printStackTrace();
		}

		// try catch with resources
		try (
				final BufferedReader in = Files.newBufferedReader(path1);
				final BufferedWriter out = Files.newBufferedWriter(path2)
		) {
			final String line = in.readLine() + "tryCatchWithResources@";
			System.out.println(line);
			out.write(line);
		}
	}
}
