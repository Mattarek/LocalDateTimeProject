package current_2025_maj.lambdy;

public class main {
	public static void main(final String[] args) {
		//		// Przyjmuje wartość typu T ale nie zwraca wartosci
		//		final Consumer<String> printer = message -> System.out.println("Wiadomość: " + message);
		//		printer.accept("Hello!");
		//
		//		// Przyjmuje T, zwraca R, tutaj przyjmuje stringa, a zwróci Integera
		//		final Function<String, Integer> stringToLength = str -> str.length();
		//		System.out.println(stringToLength.apply("Lambda"));
		//
		//		final Supplier<Double> randomSupplier = () -> Math.random();
		//		System.out.println(randomSupplier.get()); // np. 0.723498

		//		final IntPredicate isPositive = x -> x > 0;
		//
		//		final int a = 10;
		//		final int b = -5;
		//		System.out.println("a > 0? " + isPositive.test(a));
		//		System.out.println("b > 0? " + isPositive.test(b)); // false
		//
		//		//================
		//		final List<String> list = new ArrayList<>(List.of("aaa", "b", "cc"));
		//		list.sort((z, x) -> z.length() - x.length());
		//		System.out.println(list);
		//
		//		final List<String> sorted = list.stream().sorted().toList();
		//
		//		//==============
		//		final List<String> names = List.of("Anna", "Bartek", "Kasia", "Antek");
		//		final Predicate<String> startsWithA = name -> name.startsWith("A");
		//		final List<String> filtered = names.stream().filter(startsWithA).collect(Collectors.toList());
		//		System.out.println(filtered);

		// ===================================================================
		final String text = "Hello";
		final String textHi = " HI ";
		System.out.println(text.length());
		System.out.println(text.repeat(2));
		System.out.println(text.isEmpty()); // false
		System.out.println(text + "end"); // false
		System.out.println(textHi.strip()); // "Hi"

		final String splitTest = "split,test,now";
		System.out.println(splitTest);
		final String result = "Hello";
		System.out.println(result);

		final int a = 123;
		final String b = Integer.toString(a);
		System.out.println(b);
	}
}
