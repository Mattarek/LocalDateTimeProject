package current_2025.CollectionExample.List;

import java.util.ArrayList;
import java.util.List;

//✅ ArrayList<E>
//	Opis: Lista oparta na dynamicznej tablicy – najczęściej używana implementacja List.

// ➕ Zalety:
//	- Szybki dostęp do elementu po indeksie (get(i) – O(1))
//	- Bardzo dobra wydajność przy dodawaniu na końcu (add(e) – O(1) amortyzowane)
//	- Kompaktowa pamięciowo

// ➖ Wady:
//	- Wstawianie lub usuwanie ze środka/wstępu listy jest kosztowne (O(n))
//	- Nie jest synchronizowana (brak bezpieczeństwa wątkowego)

// 🎯 Kiedy używać:
//	- Potrzebujesz częstego dostępu po indeksie
//	- Często dodajesz elementy na koniec listy
//	- Pracujesz w środowisku jednowątkowym lub nie musisz się martwić o wątki
//	- Przykład: lista uczniów, produktów w koszyku, ID użytkowników

public class ArrayListExample {
	public static void main(final String[] args) {
		final List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Orange"); // Duplikat jest dozwolony
		fruits.add(0, "Apple"); // dodanie na pozycje 0
		System.out.println(fruits);

		for (final String str : fruits) {
			System.out.println(str);
		}

		// Element na pozycji o indexie 0
		System.out.println(fruits.get(0));
	}
}
