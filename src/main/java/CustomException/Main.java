package CustomException;

public class Main {
	public static void main(final String[] args) throws AgeLessThanZeroException {

		validateAge(3);
	}

	private static void validateAge(final int age) throws AgeLessThanZeroException {
		if (age < 0) {
			//			throw new AgeLessThanZeroException("Oh no! Something went wrong!");
			throw new AgeLessThanZeroException("Oh no!", new RuntimeException());
		}
	}
}
