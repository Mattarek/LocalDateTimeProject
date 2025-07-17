package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.ZadanieOne;

import java.util.stream.IntStream;

public class Factorial {
	// Napisz funkcyjną implementację silni

	public static void main(final String[] args) {
		System.out.println(factorial(6));
		factorialInLoop(6);
	}

	public static Integer factorial(final Integer n) {
		if (n < 0) {
			throw new RuntimeException("N is less than 0, this value should be positive. ");
		}
		return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
	}

	public static void factorialInLoop(final Integer n) {
		long value = 1;
		for (int i = 1; i <= n; i++) {
			value *= i;
		}
		System.out.println("Silnia (" + n + ") = " + value);
	}
}
