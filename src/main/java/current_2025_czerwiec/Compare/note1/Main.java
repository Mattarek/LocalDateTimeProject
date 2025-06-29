package current_2025_czerwiec.Compare.note1;

import old_2024.staticInheritence.A.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final Comparator<Cat> comparator = new Comparator<Cat>() {
			@Override
			public int compare(final Cat o1, final Cat o2) {
				return o1.getWeight() - o2.getWeight();
			}
		};

		final List<Cat> cats = new ArrayList<>();
		cats.add(new Cat(2));
		cats.add(new Cat(1));
		cats.add(new Cat(3));
		cats.add(new Cat(4));

		System.out.println("Before: " + cats);
		Collections.sort(cats, comparator);
		System.out.println("After: " + cats);
	}
}
