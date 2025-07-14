package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Practice5;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
	public static void main(final String[] args) {
		final Stream<String> stringStream = Stream.of("A", "AB", "ABC");
		final IntStream intStream = stringStream.mapToInt(String::length);
		intStream.forEach(System.out::println);

		DoubleStream.empty().average();
		LongStream.empty();
	}
}
