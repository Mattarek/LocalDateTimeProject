package current_2025_czerwiec.KolekcjePlusMapy.Compare.project3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		// Sortowanie alfabetycznie po tytule

		final List<Book> books = Arrays.asList(
				new Book("Zew", 1928),
				new Book("Wiedźmin", 1990),
				new Book("Lalka", 1890)
		);

		Collections.sort(books, new TitleComparator());
		books.forEach(System.out::println);
	}
}
