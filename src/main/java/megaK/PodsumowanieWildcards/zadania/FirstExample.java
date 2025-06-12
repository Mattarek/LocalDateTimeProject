package megaK.PodsumowanieWildcards.zadania;

import java.util.List;

public class FirstExample {
	public static void main(final String[] args) {

	}

	public static <T extends List<T>> int method(final T[] arg1, final T arg2) {
		return 0;
	}
}
