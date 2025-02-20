package streamsExample.StreamExample;

import java.util.stream.Stream;

public class StreamIterate {
	public static void main(final String[] args) {
		Stream.iterate(0, n -> n + 2)
				.limit(5)
				.forEach(System.out::println); // 0, 2, 4, 6, 8
	}
}
