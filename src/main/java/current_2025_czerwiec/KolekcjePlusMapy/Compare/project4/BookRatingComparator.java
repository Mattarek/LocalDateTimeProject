package current_2025_czerwiec.KolekcjePlusMapy.Compare.project4;

import java.util.Comparator;

public class BookRatingComparator implements Comparator<Book> {
	@Override
	public int compare(final Book o1, final Book o2) {
		final int cmp = Double.compare(o1.getRating(), o2.getRating());

		if (cmp == 0) {
			return o1.getTitle().compareTo(o2.getTitle());
		}
		return cmp;
	}
}
