package current_2025_czerwiec.KolekcjePlusMapy.Compare.project3;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
	@Override
	public int compare(final Book a, final Book b) {
		return a.getTitle().compareTo(b.getTitle()); // A-Z
	}
}
