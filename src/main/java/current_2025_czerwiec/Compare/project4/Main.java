package current_2025_czerwiec.Compare.project4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	//Sortowanie według kilku kryteriów
	//	Opis:
	//	Dodaj do Book pole double rating (od 0 do 10). Teraz posortuj książki:
	//	Najpierw po ocenie (malejąco)
	//	Jeśli ocena taka sama — po tytule (rosnąco)
	public static void main(final String[] args) {
		final List<Book> books = Arrays.asList(
				new Book("Zew", 1928, 7.5),
				new Book("Wiedzmin", 1928, 8.0),
				new Book("Lalka", 1928, 9.0)
		);

		books.sort(new BookRatingComparator());
		books.forEach(System.out::println);
	}
}
