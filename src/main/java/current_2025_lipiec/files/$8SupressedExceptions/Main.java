package current_2025_lipiec.files.$8SupressedExceptions;

import java.nio.file.Path;

public class Main {
	public static void main(final String[] args) {
		try (final ResourceA a = new ResourceA(); final ResourceB b = new ResourceB()) {
			System.out.println("Wewnątrz bloku try");
			throw new Exception("Główny wyjątek z try");
		} catch (final Exception e) {
			System.out.println("Złapano: " + e.getMessage());

			for (final Throwable suppressed : e.getSuppressed()) {
				System.out.println("Suppressed: " + suppressed.getMessage());
			}
		}
	}

	static class ResourceA implements AutoCloseable {
		@Override
		public void close() throws Exception {
			System.out.println("Zamykanie ResourceA");
			throw new Exception("Wyjątek z ResourceA.close()");
		}
	}

	static class ResourceB implements AutoCloseable {
		@Override
		public void close() throws Exception {
			System.out.println("Zamykanie ResourceB");
			throw new Exception("Wyjątek z ResourceB.close()");
		}
	}
}
