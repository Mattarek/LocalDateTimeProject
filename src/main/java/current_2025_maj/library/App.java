package current_2025_maj.library;

import current_2025_maj.library.model.Book;
import current_2025_maj.library.model.BookGenre;
import current_2025_maj.library.model.Librarian;
import current_2025_maj.library.model.Member;
import current_2025_maj.library.service.LibraryService;
import current_2025_maj.library.service.LibraryServiceImpl;
import current_2025_maj.library.util.LibraryFactory;

public class App {
	public static void main(final String[] args) {
		final LibraryService service = new LibraryServiceImpl();

		service.addBook(new Book(BookGenre.FICTION, "111", "Dune", "Frank Herbert"));
		service.addBook(new Book(BookGenre.HISTORY, "222", "Sapiens", "Yuval Harari"));
		service.addBook(new Book(BookGenre.HISTORY, "999", "Real Madryt. Królewska era Galacticos", "Orłowski Leszek"));

		final Member member = LibraryFactory.createUser(Member.class, "u1", "Jan Kowalski");
		final Librarian librarian = LibraryFactory.createUser(Librarian.class, "u2", "Anna Nowak");

		service.registerUser(member);
		service.registerUser(librarian);

		service.listBooks();
		service.listUsers();

		service.borrowBook("u1", "111");
		service.borrowBook("u1", "999");
	}
}
