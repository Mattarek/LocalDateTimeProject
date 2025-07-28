package current_2025_lipiec.files.$AutoCloseable;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(final String[] args) {
		example(Paths.get("someFile.txt"), Paths.get("someNewFile.txt"));
	}

	public static void example(final Path path1, final Path path2) {
		try (final Door door = new Door()) {
			System.out.println("Opening the door!");
			System.out.println(door);
		} finally {
			System.out.println("Calling finally.");
		}
	}

	static class Door implements AutoCloseable {
		public Door() {
			System.out.println("Calling door constructor!");
		}

		@Override
		public void close() {
			// jeśli implementujemy własny close(), to nasz wyjątek powinien
			// jasno opisywać co poszło nie tak i gdzie szukać błędu.
			// Close implementuje Exception, tak więc możemy dzięki niemu rzucać
			// jakikolwiek wyjątek chcemy.
			// Ta metoda powinna być idempotentna, czyli ze jest niezależna od innych czynnikow,
			// mozemy wywołać ją wielokrotnie i wynik zawsze będzie taki sam.
			System.out.println("Calling close()!");
			new RuntimeException();
		}
	}
}
