package old_2024.LambdaJump;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaTest {
	private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
	private static final Random random = new Random();
	private static final List<String> list = new ArrayList<>();

	public static String randomString(final int count) {
		final StringBuilder sb = new StringBuilder();

		sb.append(Character.toUpperCase(LETTERS.charAt(random.nextInt(LETTERS.length()))));

		for (int i = 1; i < count; i++) {
			sb.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
		}

		return sb.toString();
	}

	public static void main(final String[] args) {
		System.out.println(generate(8));
	}

	public static List<String> generate(final int count) {
		for (int i = 0; i < count; i++) {
			list.add(randomString(count));
		}
		return list;
	}
}

