package old_2024.MethodReference;

import java.util.function.Consumer;

public class MethodReferenceExample {
	public static void main(final String[] args) {
		final Consumer<String> printer = Utils::printMessage;
		printer.accept("Hello World!");
		printer.accept("1");
	}

	class Utils {
		public static void printMessage(final String message) {
			System.out.println(message);
		}
	}
}
