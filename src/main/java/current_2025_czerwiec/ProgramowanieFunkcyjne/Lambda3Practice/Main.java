package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda3Practice;

public class Main {
	public static void main(final String[] args) {
		someStaticMethod(str -> System.out.println(str));
	}

	// Higher Order Function, bo ta funka przyjmuje inną funkcję
	static IsSomeInterface someStaticMethod(final IsSomeInterface fun) {
		fun.someMethod("String");
		return other -> System.out.println("Returned: " + other);
	}

	@FunctionalInterface
	interface IsSomeInterface {
		void someMethod(String input);
	}
}
