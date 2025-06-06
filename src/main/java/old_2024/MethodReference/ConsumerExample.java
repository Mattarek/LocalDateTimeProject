package old_2024.MethodReference;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(final String[] args) {
		final Consumer<String> printConsumer = new Consumer<String>() {
			@Override
			public void accept(final String s) {
				System.out.println("Przetworzona wartość: " + s);
			}
		};

		printConsumer.accept("Hello, world!");
	}
}
