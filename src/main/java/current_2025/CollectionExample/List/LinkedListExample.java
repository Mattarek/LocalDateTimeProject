package current_2025.CollectionExample.List;

import java.util.LinkedList;
import java.util.List;

//✅ LinkedList<E>
//Opis: Lista dwukierunkowa – każdy element zawiera wskaźnik na poprzedni i następny.

//➕ Zalety (Dodawanie i usuwanie):
//	- Bardzo szybkie dodawanie i usuwanie elementów z początku/końca listy (O(1))
//	- Może działać jako Queue, Deque i Stack

//➖ Wady:
//	- Wolny dostęp po indeksie (get(i) – O(n))
//	- Większe zużycie pamięci (wskaźniki)
//	- Nie jest synchronizowana (brak bezpieczeństwa wątkowego)

//🎯 Kiedy używać:
//	- Często dodajesz lub usuwasz elementy z początku/środka listy
//	- Tworzysz strukturę kolejki (FIFO) lub dwustronnej kolejki
//	- Nie zależy Ci na szybkim losowym dostępie
//	- Przykład: kolejka pacjentów, system zadań do wykonania, bufor przesyłania danych

public class LinkedListExample {
	public static void main(final String[] args) {
		final List<String> patientQueue = new LinkedList<>();

		patientQueue.add("Pacjent A");
		patientQueue.add("Pacjent B");
		patientQueue.add("Pacjent C");
		patientQueue.add("Pacjent D");
		patientQueue.add("Pacjent E");
		patientQueue.add("Pacjent F");
		System.out.println(patientQueue.get(4));
		System.out.println(patientQueue);

		// Obsługa pierwszego pacjenta
		System.out.println("Obsługiwany:" + patientQueue.remove(0));

		// Dodanie pilnego przypadku na początek
		patientQueue.add(0, "Nagły przypadek");
		System.out.println("Aktualna kolejka: " + patientQueue);
	}
}
