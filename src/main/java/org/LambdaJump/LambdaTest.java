package org.LambdaJump;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class LambdaTest {
	private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
	private static final Random random = new Random();
	private static final List<String> list = new ArrayList<>();
	public static Supplier<String> randomString = () -> {
		int length = 8 + random.nextInt(3);
		StringBuilder sb = new StringBuilder();

		sb.append(Character.toUpperCase(LETTERS.charAt(random.nextInt(LETTERS.length()))));

		for (int i = 1; i < length; i++) {
			sb.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
		}

		return sb.toString();
	};

	public static void main(final String[] args) {
		System.out.println(generate(8, randomString));
	}

	public static List<String> generate(final int count, final Supplier<String> randomStringFunc) {
		for (int i = 0; i < count; i++) {
			list.add(randomStringFunc.get());
		}
		return list;
	}
}

