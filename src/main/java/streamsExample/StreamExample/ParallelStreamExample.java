package streamsExample.StreamExample;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
	public static void main(final String[] args) {
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		final int sum = numbers.parallelStream().reduce(0, Integer::sum);
		System.out.println("Suma: " + sum); // 55
	}
}
