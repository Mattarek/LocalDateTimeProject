package old_2024.Exceptions.ship;

public class Main {
	public static void main(final String[] args) {
		try {
			final Ship ship = new Ship("Shippek");
			if (true) {
				throw new RuntimeException("My new current_2025.library.exception!");
			}
		} finally {
			System.out.println("Finally.");
		}
		System.out.println("After finally.");
	}
}
