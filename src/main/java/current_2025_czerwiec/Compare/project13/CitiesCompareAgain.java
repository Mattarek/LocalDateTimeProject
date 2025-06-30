package current_2025_czerwiec.Compare.project13;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitiesCompareAgain implements Comparable<CitiesCompareAgain>, Comparator<CitiesCompareAgain> {
	private final String someText;
	private final Integer someNumber;

	public CitiesCompareAgain(final String someText, final Integer someNumber) {
		this.someText = someText;
		this.someNumber = someNumber;
	}

	public static void main(final String[] args) {
		final CitiesCompareAgain element1 = new CitiesCompareAgain("Text2", 2);
		final CitiesCompareAgain element2 = new CitiesCompareAgain("Text3", 3);
		final CitiesCompareAgain element3 = new CitiesCompareAgain("Text1", 1);

		final List<CitiesCompareAgain> list = new ArrayList<>();
		list.add(element1);
		list.add(element2);
		list.add(element3);

		//	🔍 Wyjaśnienie:
		//		Metoda Collections.sort(List<T> list):
		//		działa tylko wtedy, gdy klasa T implementuje Comparable<T>,
		//		używa naturalnego porządku, czyli: element1.compareTo(element2)

		//	📘 W Twoim kodzie:
		//		Klasa:
		//		public class CitiesCompareAgain implements Comparable<CitiesCompareAgain>, Comparator<CitiesCompareAgain>
		//		– implementuje oba interfejsy, ale Collections.sort(list) używa TYLKO compareTo(), bo nie przekazujesz Comparatora
		//		jako drugi argument.

		Collections.sort(list);
		System.out.println(list);

		System.out.println("=========");
		quiz();
	}

	private static void quiz() {
		final List<String> list = Arrays.asList("Warszawa", "Zakopane", "Augustów", "Jelenia Góra");
		Collections.sort(list, (e1, e2) -> e1.compareTo(e2));
		System.out.println(Collections.binarySearch(list, "Augustów"));
	}

	@Override
	public String toString() {
		return "CitiesCompareAgain{" +
				"someText='" + someText + '\'' +
				", someNumber=" + someNumber +
				'}';
	}

	@Override
	public int compareTo(@NotNull final CitiesCompareAgain o) {
		return o.someNumber - someNumber;
	}

	@Override
	public int compare(final CitiesCompareAgain o1, final CitiesCompareAgain o2) {
		return o1.someNumber.compareTo(o2.someNumber);
	}
}
