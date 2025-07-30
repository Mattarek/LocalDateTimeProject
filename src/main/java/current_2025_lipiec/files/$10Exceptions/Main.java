package current_2025_lipiec.files.$10Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(final String[] args) {
		try {
			try (
					// ctrl + H  - aby wyświetlic co implementuje Reader,
					// bo new BufferedReader przyjmuje: @NotNull Reader in, int sz
					final Reader reader = new BufferedReader(new FileReader("someFile.txt"));
					final Fridge fridge = new Fridge()
			) {
				throw new Exception("Exception while being in the Fridge! (tru)");
			} catch (final Exception e) {
				for (final Throwable throwable : e.getSuppressed()) {
					System.out.println(throwable);
				}
				System.out.println("Caught some element!");
			} finally {
				System.out.println("Message from finally");
				throw new Exception("Exception while being in finally of the Fridge! Finally");
			}
		} catch (final Exception e) {
			System.out.println("Finally after closing the Fridge! catch!");
			e.printStackTrace();
		}
	}

	static class Fridge implements AutoCloseable {
		public Fridge() {
			System.out.println("Fridge created.");
		}

		@Override
		public void close() throws Exception {
			throw new Exception("Exception while closing the Fridge");
		}
	}
}
