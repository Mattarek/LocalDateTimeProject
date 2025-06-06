package current_2025.library.service;

import current_2025.library.model.Book;
import current_2025.library.model.User;

public interface LibraryService {
	void addBook(Book book);

	void registerUser(User user);

	void borrowBook(String userId, String isbn);

	void listBooks();

	void listUsers();
}
