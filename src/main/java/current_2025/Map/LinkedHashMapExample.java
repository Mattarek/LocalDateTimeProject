package current_2025.Map;

import java.util.LinkedHashMap;

//📌 Cechy:
//	- Zachowuje kolejność dodania.
//	- Nieco wolniejsza niż HashMap.
//	- Idealna do cache'owania (np. LRU cache).

public class LinkedHashMapExample {
	public static void main(final String[] args) {
		final LinkedHashMap<String, String> steps = new LinkedHashMap<>();
		steps.put("1", "Zaloguj się");
		steps.put("2", "Wybierz produkt");
		steps.put("3", "Zamów");

		System.out.println(steps);
	}
}
