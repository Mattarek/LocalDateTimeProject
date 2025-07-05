package current_2025_czerwiec.KolekcjePlusMapy.Compare.project4;

public class Book {
	private final String title;
	private final int year;
	private final double rating;

	public Book(final String title, final int year, final double rating) {
		this.title = title;
		this.rating = rating;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				", year=" + year +
				", rating=" + rating +
				'}';
	}
}
