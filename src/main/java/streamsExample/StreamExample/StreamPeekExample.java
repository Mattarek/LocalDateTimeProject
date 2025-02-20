package streamsExample.StreamExample;

import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekExample {
	public static void main(final String[] args) {
		final List<String> names = List.of("Anna", "Jan", "Paweł");
		final List<String> debug = names.stream()
				.peek(name -> System.out.println("Przetwarzam: " + name))
				.collect(Collectors.toList());
	}
}
