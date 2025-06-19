package megaK.genericsExercise.ExerciseSix;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 6. Napisz klasę reprezentującą stos różnego rodzaju przedmiotów, np. książki, gazety i smartfony(jednocześnie).
// Spróbuj zakodować tę klasęprzy wykorzystainiu mechanizmu generyków a nasępnie zastanów się jak mogłby wyglądać
// bez ichc uzycia. Zwróć Optional celem pokazania, ze na tym stosie może nie być żadnych elementów.ok ale
public class Main {
	public static void main(final String[] args) {
		final Stack books = new Stack();
		books.put(new Book());
		books.put(new Smartphone());
		books.put(new Book());
		System.out.println(books.take().orElse(null));
		System.out.println(books);
	}

	public static class Stack {
		private final List stack = new ArrayList();

		public void put(final ItemOnTable element) {
			if (element == null) {
				return;
			}
			stack.add(element);
		}

		public Optional take() {
			if (stack.size() == 0) {
				return Optional.empty();
			}

			return Optional.ofNullable(stack.remove(stack.size() - 1));
		}

		@Override
		public String toString() {
			return "Stack{" +
					"stack=" + stack +
					'}';
		}
	}

	public static class Book implements ItemOnTable {
		@Override
		public String toString() {
			return "Book{}";
		}
	}

	public static class Smartphone implements ItemOnTable {
		@Override
		public String toString() {
			return "Smartphone{}";
		}
	}

	public static class Newspapper implements ItemOnTable {
		@Override
		public String toString() {
			return "Newspapper{}";
		}
	}
}
