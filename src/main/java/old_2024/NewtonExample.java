package old_2024;

import java.math.BigInteger;
import java.util.Scanner;

public class NewtonExample {
	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);

		System.out.print("Podaj n: ");
		final int n = scanner.nextInt();

		System.out.print("Podaj k: ");
		final int k = scanner.nextInt();

		if (k < 0 || n < 0 || k > n) {
			System.out.println("Niepoprawne wartości n i k!");
		} else {
			System.out.println("C(" + n + ", " + k + ") = " + newton(n, k));
		}

		scanner.close();
	}

	public static BigInteger newton(final int n, final int k) {
		return factorial(BigInteger.valueOf(n))
				.divide(factorial(BigInteger.valueOf(k)).multiply(factorial(BigInteger.valueOf(n - k))));
		//return factorial(BigInteger.valueOf(n).divide(factorial(BigInteger.valueOf(k).multiply(factorial(BigInteger
		// .valueOf(n - k))))))
	}

	public static BigInteger factorial(final BigInteger num) {
		BigInteger result = BigInteger.ONE;
		for (final BigInteger i = BigInteger.TWO; i.compareTo(num) <= 0; i.add(BigInteger.ONE)) {
			result = result.multiply(i);
		}
		return result;
	}
}
