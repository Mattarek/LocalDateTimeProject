package current_2025.Map;

import java.util.concurrent.ConcurrentHashMap;

//📌 Cechy:
//	- Wersja HashMap dostosowana do środowisk wielowątkowych.
//	- Brak potrzeby blokowania całej mapy.
//	- Lepsza wydajność niż Hashtable.
public class ConcurrentHashMapExample {
	public static void main(final String[] args) {
		final ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();
		stock.put("Jabłka", 10);
		stock.put("Gruszki", 15);

		// Jednoczesny odczyt i zapis w wielu wąkach jest bezpieczny
		stock.compute("Jabłka", (key, value) -> value - 1);

		System.out.println("Pozostało jabłek: " + stock.get("Jabłka"));
	}
}
