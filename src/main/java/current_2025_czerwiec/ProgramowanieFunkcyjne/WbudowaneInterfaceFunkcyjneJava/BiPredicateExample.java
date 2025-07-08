package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava;

import org.jetbrains.annotations.NotNull;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(final String[] args) {
		final BiPredicate<String, Dog> biPredicate = BiPredicateExample::getStringDogBiPredicate;
		final boolean test = biPredicate.test("Dog", new Dog());
		System.out.println(test);
	}

	private static @NotNull Boolean getStringDogBiPredicate(final String str, final Dog dog) {
		System.out.println("Testing: " + str + ", dog: " + dog);
		return dog.toString().contains(str);
	}

	static class Dog {
	}
}
