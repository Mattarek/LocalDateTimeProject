package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda2;

public class Main {
	public static void main(final String[] args) {
		final Lambdable lambda = new LambdaImpl();
		System.out.println(lambda.countChars("Zajavka", "Dzawaaaa"));

		// value to będzie wartość jaką przekażę przy wywołaniu:
		final Lambdable lambdaInLine = (value, valueTwo) -> value.length() + valueTwo.length();
		System.out.println(lambdaInLine.countChars("Zajavka", "Dzawaaaa"));

		// Sprawdzamy jaka klasa jest pod tym interfacem
		System.out.println(lambda.getClass());
	}
}
