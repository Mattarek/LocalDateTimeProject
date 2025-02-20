package streamsExample.StreamExample;

import java.util.stream.IntStream;

public class IntStreamLongStreamDoubleStream {
	public static void main(final String[] args) {
		final int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
	}
}
