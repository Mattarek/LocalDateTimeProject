package org.staticExample;

public class Example {
	private static int count;

	public Example() {
		count++;
	}

	public static int getCount() {
		return count;
	}
}
