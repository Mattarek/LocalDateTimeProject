package current_2025.SOLID.D.Złe;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private final List<Book> books = new ArrayList<>();

	private final List<Newspaper> newspapers = new ArrayList<>();

	public void addBook(final Book book) {
		books.add(book);
	}

	public void addNewspaper(final Newspaper newspaper) {
		newspapers.add(newspaper);
	}
}
