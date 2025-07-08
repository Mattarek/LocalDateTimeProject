package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(final String[] args) {
		// Consumer: Przyjmuje jakiś typ jaki mu zdefiniujemy np: Consumer<String> i nic nie zwraca (void).
		// public interface Consumer<T> {
		// void accept(T t);

		final Consumer<String> consumer1 = System.out::println;
		final Consumer<String> consumer2 = input -> {
			if (input.equals("abc")) {
				return;
			}
			extracted(input);
		};
		consumer1.accept("qwe");
		consumer2.accept("qwe");
		consumer2.accept("abc");
	}

	public static void extracted(final String input) {
		System.out.println("Calling accpept.");
		System.out.println(input);
	}
}
