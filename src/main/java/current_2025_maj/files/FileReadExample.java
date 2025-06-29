package current_2025_maj.files;

import java.io.BufferedReader; // do buforowanego odczytu całych linii.
import java.io.FileReader; //  do odczytu znakowego z pliku.
import java.io.IOException; // do obsługi błędów wejścia/wyjścia.

public class FileReadExample {
	public static void main(final String[] args) {

		// 🔐 Rozpoczynamy blok try, aby obsłużyć potencjalne błędy podczas pracy z plikiem.

		try {
			// 📂 Tworzymy obiekt FileReader, który otwiera plik o nazwie plik.txt.
			// Jeśli plik nie istnieje, zostanie rzucony wyjątek FileNotFoundException.
			final FileReader fr = new FileReader("plik.txt");

			// Dzięki buforowaniu możemy korzystać z .readLine().
			// 🚀 Obiekt BufferedReader opakowuje FileReader dla wydajniejszego odczytu linia po linii.
			final BufferedReader br = new BufferedReader(fr);

			// 📦 Deklarujemy zmienną line, która będzie przechowywać każdą kolejną linię tekstu z pliku.
			String line;

			//🔄 Pętla while odczytuje linie z pliku dopóki nie natrafi na null (koniec pliku).
			// Każda linia zostaje wypisana na konsolę.
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			// 🧹 Zamykamy BufferedReader, co automatycznie zamyka też FileReader.
			// To ważne dla zwolnienia zasobów systemowych.
			br.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}