package megaK.unboundedWildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
	public static void main(final String[] args) {
		final Tuna<String> tuna = new Tuna<>();
		tuna.eat("trash");

		final Tuna<?> newTuna = tuna;
		newTuna.eat(null);
		tuna.getName();
	}

	private static void print(final List<?> strings) {
		for (final Object o : strings) {
			System.out.println(o);
		}
	}

	static class Tuna<U> {
		private U element;

		void eat(final U element) {
			this.element = element;
		}

		String getName() {
			return "Roman";
		}
	}
}
