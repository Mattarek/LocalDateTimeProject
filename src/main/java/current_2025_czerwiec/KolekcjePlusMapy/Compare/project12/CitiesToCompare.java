package current_2025_czerwiec.KolekcjePlusMapy.Compare.project12;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CitiesToCompare implements Comparable<CitiesToCompare> {
	private final String someText;
	private final Integer someNumber;

	public CitiesToCompare(final String someText, final int someNumber) {
		this.someText = someText;
		this.someNumber = someNumber;
	}

	public static void main(final String[] args) {
		final CitiesToCompare element1 = new CitiesToCompare("Text1", 2);
		final CitiesToCompare element2 = new CitiesToCompare("Text2", 1);
		final List<CitiesToCompare> list = new ArrayList<>();
		list.add(element1);
		list.add(element2);
		Collections.sort(list);
		System.out.println(list);
	}

	@Override
	public String toString() {
		return "CitiesComparator{" +
				"someText='" + someText + '\'' +
				", someNumber=" + someNumber +
				'}';
	}

	@Override
	public int compareTo(@NotNull final CitiesToCompare o) {
		return someText.compareTo(o.someText);
	}
}
