package old_2024.staticExample;

public class Example {
	private static int count;

	public Example() {
		count++;
	}

	public static int getCount() {
		return count;
	}
}
