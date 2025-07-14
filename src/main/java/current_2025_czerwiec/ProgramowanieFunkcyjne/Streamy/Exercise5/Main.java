package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Exercise5;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
	public static void main(final String[] args) {
		final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		final Integer reduce = numbers.stream()
				.reduce(0, Integer::sum);
		System.out.println(reduce);

		final OptionalDouble avg = numbers.stream().mapToInt(i -> i).average();
		System.out.println(avg);

		final int result = numbers.stream()
				.mapToInt(v -> v)
				.peek(a -> System.out.println(a))
				.sum();
		System.out.println(result);

		final OptionalDouble average = DoubleStream.generate(Math::random).limit(10).average();
		System.out.println(average);

		IntStream.iterate(5, p -> p * 3)
				.limit(10)
				.forEach(value -> System.out.println("IntStream: " + value));

		DoubleStream.iterate(5, p -> p * 3)
				.limit(10)
				.forEach(value -> System.out.println("DoubleStream: " + value));

		LongStream.iterate(5, p -> p * 3)
				.limit(10)
				.forEach(value -> System.out.println("LongStream: " + value));

		System.out.println("LongStream range:");
		LongStream.range(1, 5).forEach(System.out::println); // od 1 do 4

		System.out.println("LongStream rangeClosed:");
		LongStream.rangeClosed(1, 5).forEach(System.out::println); // od 1 do 5
	}
}
