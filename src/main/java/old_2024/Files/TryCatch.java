package old_2024.Files;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatch {
	public static void main(final String[] args) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("example.txt", true); // true - dopisuje do pliku
			fileWriter.write("Wiadomość dopisana przy użyciu try-catch.\n");
			System.out.println("Wiadomość została dopisana do pliku.");
		} catch (final IOException e) {
			System.err.println("Wystąpił błąd: " + e.getMessage());
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (final IOException e) {
					System.err.println("Błąd przy zamykaniu pliku: " + e.getMessage());
				}
			}
		}
	}
}
