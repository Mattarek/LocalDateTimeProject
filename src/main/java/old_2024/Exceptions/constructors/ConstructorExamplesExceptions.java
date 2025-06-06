package old_2024.Exceptions.constructors;

public class ConstructorExamplesExceptions {
	public static void main(final String[] args) {
		// Teraz nie widzimy, że w Person zostanie rzucony wjątek,
		try {
			final Person person = new Man(1000);
		} catch (final WrongAgeException e) {
			System.out.println("oops!");
		}
	}
}
