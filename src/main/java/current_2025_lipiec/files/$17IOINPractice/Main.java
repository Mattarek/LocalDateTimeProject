package current_2025_lipiec.files.$17IOINPractice;

import org.testng.internal.protocols.Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
	public static void main(final String[] args) {
		try (
				final InputStream inputStream = new FileInputStream("src/main/java/current_2025_lipiec/files" +
						"/$17IOINPractice/input.txt");
				final OutputStream outputStream = new FileOutputStream("src/main/java/current_2025_lipiec/files" +
						"/$17IOINPractice/output.txt")
		) {
			int value = inputStream.read(); // odczytaj pierwszą wartość

			while (value != -1) { // wejdz do petli jesli nie jest -1, czyli cos masz
				outputStream.write(value); // wpisz do pliku docelowego
				value = inputStream.read(); // przypisz kolejną wartosc i sprawdź czy ona jest (-1 jesli nie ma)
				System.out.println(value);
			}
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
