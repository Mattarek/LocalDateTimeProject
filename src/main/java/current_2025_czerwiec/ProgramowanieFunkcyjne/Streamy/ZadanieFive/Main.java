package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.ZadanieFive;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	// 5. Jeżeli podpowiem, że String posada metodę chars(), która generuje IntStream, spróbuj zaimplementować
	// sprawdzanie, czy słowo zdanie jest palindromem, przy wykorzystaniu streamow.
	// - palindrom, czyli slowo pisane z przodu i z tylu jest takim samym slowm jak kajak
	public static void main(final String[] args) {
		isPalindrome("qweqwe");
		isPalindrome("kajak");
		System.out.println(isPalindrome("qweqwe"));
		System.out.println(isPalindrome("kajak"));
	}

	//	// nr.1
	//	public static boolean isPalindrome(final String input) {
	//		final String reversed = new StringBuilder(input).reverse().toString();
	//		return reversed.equals(input);
	//	}

	// nr.2
	public static boolean isPalindrome(final String input) {
		final String q = input.chars() // input.chars() → IntStream kodów znaków
				.mapToObj(value -> String.valueOf((char) value)) // Stream<String> pojedynczych znaków
				.collect( // collect(...) → własny kolektor:
						StringBuilder::new, // StringBuilder::new – zaczynamy od pustego buildera
						(sb, sp) -> sb.insert(0, sp), // dla każdego znaku wstawiamy go na początek buildera
						(sb1, sb2) -> sb1.insert(0, sb2)) //  jak trzeba połączyć wyniki (przy równoległych strumieniach)
				.toString();

		return q.equals(input);
	}

	//	// nr.3
	//	public static boolean isPalindrome(final String input) {
	//		int len = input.length();
	//		return IntStream.range(0, len / 2)
	//				.allMatch(i -> input.charAt(i) == input.charAt(len - 1 - i));
	//	}

	//	public static boolean isPalindrome(final String input) {
	//		return input.equals(new StringBuilder(input).reverse().toString());
	//	}
}
