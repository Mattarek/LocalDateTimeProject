package old_2024.streamsExample.StreamExample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
	public static void main(final String[] args) {
		final List<Integer> numbers = List.of(10, 3, 25, 8, 1);
		final Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		// Liczby parzyste: [10, 8]
		System.out.println("Liczby parzyste: " + partitioned.get(true));

		// Liczby nieparzyste: [3, 25, 1]
		System.out.println("Liczby nieparzyste: " + partitioned.get(false));
	}
}
