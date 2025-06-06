package old_2024.StreamsWithOptional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalInStreamMethod {
	public static void main(final String[] args) {
		final Stream<String> result = Stream.of(1, 2, 3, 4, 5).map(OptionalInStreamMethod::findValue)
				.flatMap(Optional::stream);

		result.forEach(System.out::println);
	}

	static Optional<String> findValue(final int num) {
		//		Even-2
		//		Even-4
		//		➡ Wyszukujemy tylko parzyste liczby i zamiast null, używamy Optional, który konwertujemy na Stream i odfiltrowujemy puste wartości.
		return num % 2 == 0 ? Optional.of("Even-" + num) : Optional.empty();
	}
}
