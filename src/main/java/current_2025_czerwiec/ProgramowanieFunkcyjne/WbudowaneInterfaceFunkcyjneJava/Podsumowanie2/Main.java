package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.Podsumowanie2;

import java.util.function.Function;

public class Main {
	public static void main(final String[] args) {
		final Function<Integer, String> integerStringFunction = i -> {
			try {
				return i > 0 ? handleGreaterThanZero(i) : i.toString();
			} catch (final Exception e) {
				e.printStackTrace();
			}
			return "Error";
		};

		System.out.println(integerStringFunction.apply(1));
	}

	private static String handleGreaterThanZero(final Integer i) throws Exception {
		throw new ExceptionExample(1 + " greater than 0!");
	}
}
