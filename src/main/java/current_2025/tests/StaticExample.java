package current_2025.tests;

public class StaticExample {
	private static int count;

	public StaticExample() {
		count++;
	}

	public static int getCound() {
		return count;
	}
}
