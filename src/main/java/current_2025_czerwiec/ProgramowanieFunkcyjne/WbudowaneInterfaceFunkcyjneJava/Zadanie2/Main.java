package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.Zadanie2;

public class Main {
	/*
		2. Napisz interfejs funkcyjny z metoda któa przyjmie od Ciebei String, Integer oraz dowolny obiekt.
		Typem zwracanym z takiej metody będzie Integer. Napisz 2 implementacje funkcyjne takiej metody.
			- Pierwsza ma zwracać sumę długości przekazanego Stringa, przekazanego Integera oraz długości
				Stringa zwróconego z wywołanej metody toString() na przekazanym ostatnim obiekcie do metody.
			- Druga ma dodać do siebie liczbę wystąpień litery 'a' w pierwszym Stringu, wartość perzekazaną jako
				Integer oraz ilość wystąpień przecinków zsumowaną  z ilością wystąpień '=' w metodzie toString()
				wywołanej na przekazanym ostatnim obiekcie.
	*/
	public static void main(final String[] args) {
		// 1.
		final TripleFunction<Dog> tripleFunction =
				(String s, Integer i, Dog d) -> Integer.valueOf(s.length() + i.toString().length() + d.toString().length());
		final Dog dog = new Dog("Burek", "Dog");
		System.out.println("1: " + tripleFunction.apply("qweqtwqqwg", 12345, dog));

		// 2.
		final TripleFunction<Dog> tripleFunctionTwo =
				(final String s, final Integer i, final Dog d) -> {
					final int aCount = (int) s.chars().filter(c -> c == 'a').count();
					final String dogDescription = d.toString();
					final int equalsSignCount = (int) dogDescription.chars().filter(c -> c == '=').count();
					final int commaCount = (int) dogDescription.chars().filter(c -> c == ',').count();

					return aCount + i + equalsSignCount + commaCount;
				};
		System.out.println("2: " + tripleFunctionTwo.apply("a", 18, new Dog("Doggy", "Dog")));
	}

	private static class Dog {
		private final String name;
		private final String breed;

		public Dog(final String name, final String breed) {
			this.name = name;
			this.breed = breed;
		}

		@Override
		public String toString() {
			return "Dog{" +
					"name='" + name + '\'' +
					", breed='" + breed + '\'' +
					'}';
		}
	}
}