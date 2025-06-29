package current_2025_maj.library.service;

import current_2025_maj.library.exception.BookNotFoundException;
import current_2025_maj.library.exception.UserNotFoundException;
import current_2025_maj.library.model.Book;
import current_2025_maj.library.model.User;

public class LibraryServiceImpl extends AbstractLibraryService {

	@Override
	public void borrowBook(final String userId, final String isbn) {
		try {
			final User user = findUser(userId);
			final Book book = findBook(isbn);
			borrowedBooks.get(userId).add(book);
			System.out.println(user.getName() + " borrowed: " + book.getTitle());
		} catch (final BookNotFoundException | UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}