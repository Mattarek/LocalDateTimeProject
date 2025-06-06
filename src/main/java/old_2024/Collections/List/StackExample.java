package old_2024.Collections.List;

import java.util.Stack;

/*
Implementacja stosu (LIFO – Last In, First Out).
Dziedziczy po Vector.
Używany do operacji na stosie, np. historia działań.
 */

public class StackExample {
	public static void main(final String[] args) {
		final Stack<String> stack = new Stack<>();

		stack.push("Strona 1");
		stack.push("Strona 2");
		stack.push("Strona 3");

		System.out.println("Ostatnia strona: " + stack.peek()); // Podgląd szczytu stosu

		while (!stack.isEmpty()) {
			System.out.println("Cofanie: " + stack.pop()); // Usuwa szczyt stosu
		}
	}
}
