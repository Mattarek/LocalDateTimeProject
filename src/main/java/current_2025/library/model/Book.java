package current_2025.library.model;

public class Book {
	private final String isbn;
	private final String title;
	private final String author;
	private final BookGenre gentre;

	public Book(final BookGenre gentre, final String isbn, final String title, final String author) {
		this.gentre = gentre;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public BookGenre getGentre() {
		return gentre;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return STR."Book{isbn='\{isbn}', title='\{title}', author='\{author}', gentre=\{gentre}}";
	}
}
