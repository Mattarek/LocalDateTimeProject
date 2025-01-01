package org.Files;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchWithResources {
	public static void main(final String[] args) {
		try (final FileWriter fileWriter = new FileWriter("exampleTryCatchResources")) {
			fileWriter.write("Hello, World!");
			System.out.println("Wiadomość została dopisana do pliku.");
		} catch (final IOException e) {
			System.err.println("Wystąpił błąd: " + e.getMessage());
		}
	}
}
