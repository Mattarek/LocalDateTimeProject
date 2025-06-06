package old_2024.Collections.courseList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetAndMap {
	public static void main(final String[] args) {
		final Map<String, List<String>> citiesAttractions = new HashMap<>();

		final List<String> warsawAttractions = new ArrayList<>();
		warsawAttractions.add("Palac Kultury i Sztuki");
		warsawAttractions.add("Metro Politechnika");

		citiesAttractions.put("Warsaw", warsawAttractions);
		citiesAttractions.put("London", List.of("London Eye", "Buckingham Palace"));

		// {Warsaw=[Palac Kultury i Sztuki, Metro Politechnika], London=[London Eye, Buckingham Palace]}
		System.out.println(citiesAttractions);

		// [Warsaw=[Palac Kultury i Sztuki, Metro Politechnika], London=[London Eye, Buckingham Palace]]
		System.out.println(citiesAttractions.entrySet());

		final Set<Map.Entry<String, List<String>>> citiesAttractionsEntries = citiesAttractions.entrySet();

		//		Warsaw
		//		Warsaw 's attraction: Palac Kultury i Sztuki
		//		Warsaw 's attraction: Metro Politechnika
		//		London
		//		London 's attraction: London Eye
		//		London 's attraction: Buckingham Palace
		for (final Map.Entry<String, List<String>> citiesAttractionsEntry : citiesAttractionsEntries) {
			final String city = citiesAttractionsEntry.getKey();
			System.out.println(city);
			for (final String atraction : citiesAttractionsEntry.getValue()) {
				System.out.println(city + "'s attraction: " + atraction);
			}
		}

		final Set<String> citiesAttractionsKeys = citiesAttractions.keySet();
		final Collection<List<String>> citiesAttractionsValues = citiesAttractions.values();

		// [Warsaw, London]
		System.out.println(citiesAttractionsKeys);

		// [[Palac Kultury i Sztuki, Metro Politechnika], [London Eye, Buckingham Palace]]
		System.out.println(citiesAttractionsValues);
	}
}
