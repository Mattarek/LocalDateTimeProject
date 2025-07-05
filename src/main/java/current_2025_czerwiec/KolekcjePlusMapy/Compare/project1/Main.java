package current_2025_czerwiec.KolekcjePlusMapy.Compare.project1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<Book> booksList = Arrays.asList(new Book("z", 1),
				new Book("a", 2),
				new Book("c", 3),
				new Book("d", 4),
				new Book("e", 5));

		// Comparator
		//		final Comparator<Book> comparator = Comparator.<Book>naturalOrder().reversed();
		//		System.out.println(booksList);
		//		booksList.sort(comparator);
		//		System.out.println(booksList);

		//
		//		booksList.sort((b1, b2) -> b2.getNumberOfPages() - b1.getNumberOfPages());

		System.out.println(booksList);
		//		booksList.sort((b1, b2) -> b2.getNumberOfPages() - b1.getNumberOfPages());

		booksList.sort(Comparator.comparing(Book::getName).thenComparing(Book::getName));
		System.out.println(booksList);
	}
}
