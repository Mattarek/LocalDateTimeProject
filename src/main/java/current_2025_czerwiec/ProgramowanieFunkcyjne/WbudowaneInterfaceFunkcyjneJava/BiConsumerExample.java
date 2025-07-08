package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava;

import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(final String[] args) {

		final BiConsumer<String, Dog> biConsumer = BiConsumerExample::getStringDogBiConsumer;
		biConsumer.accept("milk", new Dog());
	}

	@NotNull
	private static void getStringDogBiConsumer(final String str, final Dog dog) {
		System.out.println("Cat: " + dog + " likes eating words: " + str);
	}

	static class Dog {
	}
}
