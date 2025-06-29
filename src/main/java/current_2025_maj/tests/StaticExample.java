package current_2025_maj.tests;

public class StaticExample {
	private static int count;

	public StaticExample() {
		count++;
	}

	public static int getCound() {
		return count;
	}
}
