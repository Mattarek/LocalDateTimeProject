package current_2025_czerwiec.KolekcjePlusMapy.Compare.project2;

import org.jetbrains.annotations.NotNull;

public class Book implements Comparable<Book> {
	private final String title;
	private final int year;

	public Book(final String title, final int year) {
		this.title = title;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				", year=" + year +
				'}';
	}

	@Override
	public int compareTo(@NotNull final Book o) { // Nasza metoda która nadpisujemy
		return Integer.compare(year, o.year);
	}
}
