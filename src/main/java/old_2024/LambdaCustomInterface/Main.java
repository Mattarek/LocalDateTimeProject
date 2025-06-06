package old_2024.LambdaCustomInterface;

import java.util.function.Predicate;

public class Main {
	public static void main(final String[] args) {
		final Predicate<String> somePredicate = someInput -> "Zajavka".equals(someInput);
		final boolean someBoolean = somePredicate.test("par1");
		System.out.println(someBoolean);
	}
}

