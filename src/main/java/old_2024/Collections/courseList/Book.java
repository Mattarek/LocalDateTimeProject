package old_2024.Collections.courseList;

import java.util.Objects;

public class Book {
	private final String title;

	public Book(final String title) {
		this.title = title;
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Book book)) {
			return false;
		}
		return Objects.equals(title, book.title);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(title);
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				'}';
	}
}
