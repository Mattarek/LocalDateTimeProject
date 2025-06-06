package current_2025.library.service;

import current_2025.library.exception.BookNotFoundException;
import current_2025.library.exception.UserNotFoundException;
import current_2025.library.model.Book;
import current_2025.library.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractLibraryService implements LibraryService {
	protected Map<String, Book> books = new HashMap<>();
	protected Map<String, User> users = new HashMap<>();
	protected Map<String, List<Book>> borrowedBooks = new HashMap<>();

	@Override
	public void addBook(final Book book) {
		books.put(book.getIsbn(), book);
	}

	@Override
	public void registerUser(final User user) {
		users.put(user.getId(), user);
		borrowedBooks.put(user.getId(), new ArrayList<>());
	}

	@Override
	public void listBooks() {
		books.values().forEach(System.out::println);
	}

	@Override
	public void listUsers() {
		users.values().forEach(System.out::println);
	}

	protected Book findBook(final String isbn) throws BookNotFoundException {
		final Book book = books.get(isbn);
		if (book == null) {
			throw new BookNotFoundException("Book not found: " + isbn);
		}
		return book;
	}

	protected User findUser(final String userId) throws UserNotFoundException {
		final User user = users.get(userId);
		if (user == null) {
			throw new UserNotFoundException("User not found: " + userId);
		}
		return user;
	}
}
