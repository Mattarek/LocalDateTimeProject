package current_2025_czerwiec.Compare.project1;

public class Book implements Comparable<Book> {
	private final String name;
	private final int numberOfPages;

	public Book(final String name, final int numberOfPages) {
		this.name = name;
		this.numberOfPages = numberOfPages;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	@Override
	public int compareTo(final Book book) {
		return numberOfPages - book.numberOfPages;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				", numberOfPages=" + numberOfPages +
				'}';
	}
}