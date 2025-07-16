package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Collectors1Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(final String[] args) {
		final Long collect = List.of("One", "Two", "Three").stream()
				.collect(Collectors.mapping(u -> u.length(), Collectors.counting()));
		// Optional bo to zwraca nam Collectors.reducing((q,e) -> q + e)
		System.out.println(collect); // 3

		final Map<Boolean, List<Integer>> collectPartitioningBy = Stream.of(1, 2, 3, 4)
				.collect(Collectors.partitioningBy(v -> v % 2 == 0));
		System.out.println(collectPartitioningBy); // {false=[1, 3], true=[2, 4]}

		final Map<String, Vehicle> collectVehicle = IntStream.range(1, 6).boxed()
				// boxed zwraca nam Stream<Integer>
				// a samo IntStream.range(1,6) zwraca IntStream
				.collect(Collectors.toMap(
						v -> "Key: " + v,
						Vehicle::new,
						(a, b) -> new Vehicle(a.numberOfWheels + b.numberOfWheels),
						TreeMap::new
				));

		final Map<String, Vehicle> collectVehicleOnIntStream = IntStream.range(1, 6).collect(
				TreeMap::new,
				(map, value) -> map.put("Key: " + value, new Vehicle(value)),
				TreeMap::putAll
		);

		System.out.println(collectVehicle);
		System.out.println(collectVehicleOnIntStream);

		final TreeMap<Integer, List<String>> treeMapWithGroupingBy =
				Stream.of("Tukan", "Ara", "Bocian", "Gołąb", "Sójka", "Kruk", "Struś").collect(Collectors.groupingBy(
						String::length,
						TreeMap::new,
						Collectors.toCollection(ArrayList::new)
				));

		System.out.println(treeMapWithGroupingBy);
	}

	private static class Vehicle {
		private final Integer numberOfWheels;

		public Vehicle(final Integer numberOfWheels) {
			this.numberOfWheels = numberOfWheels;
		}

		@Override
		public String toString() {
			return "Vehicle{" +
					"numberOfWheels=" + numberOfWheels +
					'}';
		}
	}
}
