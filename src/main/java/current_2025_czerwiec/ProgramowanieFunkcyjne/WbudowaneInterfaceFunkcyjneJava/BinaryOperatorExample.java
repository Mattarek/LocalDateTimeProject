package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	public static void main(final String[] args) {
		final BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
		final BinaryOperator<String> binaryOperator1 = String::concat;
		// Pod spodem:
		final BiFunction<String, String, String> BiFunctionOperator = String::concat;

		final String result = binaryOperator.apply("zajavka", "jest super!");
		System.out.println(result);
	}

	private static String concat(final String str1, final String str2) {
		return str1 + str2;
	}
}
