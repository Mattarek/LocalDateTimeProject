package old_2024.LambdaJump;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(final String[] args) {
		//		final Jumpable jumpable = new Animal();
		//		System.out.println(jumpable.canJump("jump", true));
		//
		//		final Predicate<String> jumpableLambda = s -> true;
		//		jumpableLambda.test("s");
		final Predicate<String> ifEmptyFilter = s -> {
			System.out.println("Checking: " + s);
			return s.isEmpty(); // usuń jeśli to pusty ciąg znakow
		};

		final List<String> list = new ArrayList<>();
		list.add("");
		list.add("Warka");
		list.add("Parka");

		System.out.println(list);
		list.removeIf(ifEmptyFilter);
		System.out.println(list);
	}
}
