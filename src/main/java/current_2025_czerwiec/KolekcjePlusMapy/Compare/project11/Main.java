package current_2025_czerwiec.KolekcjePlusMapy.Compare.project11;

import java.util.Arrays;

public class Main {
	public static void main(final String[] args) {
		final String[] cities = {"WARSZAWA", "ZAKOPANE", "GDYNIA"};
		Arrays.sort(cities, new CitiesComparator());
		System.out.println(Arrays.toString(cities));
	}
}
