package current_2025_maj.Map;

import java.util.HashMap;

//📌 Cechy:
//	- Brak gwarancji kolejności.
//	- Szybkie operacje put, get, remove.
//	- Dozwolone null jako klucz i wartości.
public class HashMapExample {
	public static void main(final String[] args) {
		final HashMap<String, Integer> scores = new HashMap<>();
		scores.put("Jan", 95);
		scores.put("Anna", 87);
		scores.put("Piotr", 100);
		System.out.println(scores);
	}
}
