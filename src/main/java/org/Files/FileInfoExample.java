package org.Files;

import java.io.File;

public class FileInfoExample {
	public static void main(final String[] args) {
		final File file = new File("example.txt");
		if (file.exists()) {
			System.out.println("Nazwa pliku: " + file.getName());
			System.out.println("Ścieżka absolutna: " + file.getAbsolutePath());
			System.out.println("Czy plik jest zapisywalny: " + file.canWrite());
			System.out.println("Czy plik jest czytelny " + file.canRead());
			System.out.println("Rozmiar pliku: " + file.length() + " bajtów.");
		} else {
			System.out.println("Plik nie istnieje.");
		}
	}
}
