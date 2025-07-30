package current_2025_lipiec.files.$12IOStreamy;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(final String[] args) {
		//		final String someeSentence = "some sentence ÓŻŹĆ";
		//		someeSentence.getBytes(StandardCharsets.UTF_8);
		//		final byte[] bytes = someeSentence.getBytes(StandardCharsets.UTF_8);
		//		System.out.println(bytes);
		//
		//		final String result = new String(bytes, StandardCharsets.US_ASCII);
		//		System.out.println(result);
		//
		//		Charset.availableCharsets().keySet().forEach(System.out::println);
		//		Charset.forName("windows-1250");
		//		System.out.println();

		// =======================
		final char someSign = 'B';
		System.out.println((int) someSign); // 66

		final char someValue = 66;
		System.out.println(someValue); // B
	}
}
