package StreamsWithOptional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalInStreamMethod {
	public static void main(final String[] args) {
		final Stream<String> result = Stream.of(1, 2, 3, 4, 5).map(OptionalInStreamMethod::findValue)
				.flatMap(Optional::stream);

		result.forEach(System.out::println);
	}

	static Optional<String> findValue(final int num) {
		return num % 2 == 0 ? Optional.of("Even-" + num) : Optional.empty();
	}
}
