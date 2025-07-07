package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda3Practice;

public class Factorial {
	public static void main(final String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(factorial(6));
		System.out.println(factorial(7));
		System.out.println(factorial(8));
	}

	static Integer factorial(final Integer value) {
		if (value == 0) {
			return 1;
		}

		return value * factorial(value - 1);
	}
}
