package current_2025.CollectionExample.List;

import java.util.Stack;

// PRZESTARZAŁA
//✅ Stack<E> (dziedziczy po Vector)
//	- Opis: Implementacja stosu LIFO (Last In, First Out) oparta na Vector.
//
//➕ Zalety:
//	- Obsługuje push(), pop(), peek()
//	- Działa jak klasyczny stos
//
//➖ Wady:
//	- Oparta na przestarzałym Vector
//	- Brak elastyczności (np. brak wsparcia dla kolejek dwustronnych)
//
//🎯 Kiedy używać:
//	- Potrzebujesz stosu (LIFO)
//	- Ale: nowocześniejsze rozwiązanie to Deque (ArrayDeque jako Stack)
//	- Przykład: historia przeglądarki, odwrotne przetwarzanie danych, rekurencja

public class StackExample {
	public static void main(final String[] args) {
		final Stack<String> browserHistory = new Stack<>();

		browserHistory.push("google.com");
		browserHistory.push("stackoverflow.com");
		browserHistory.push("github.com");

		System.out.println("Aktualna strona: " + browserHistory.peek());

		// Cofnij o jedną stronę
		browserHistory.pop();

		System.out.println("Po cofnięciu " + browserHistory.peek());
	}
}
