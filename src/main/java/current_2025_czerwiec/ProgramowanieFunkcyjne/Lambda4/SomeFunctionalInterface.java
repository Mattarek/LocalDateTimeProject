package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda4;

@FunctionalInterface
public interface SomeFunctionalInterface {
	static String someStatic() {
		System.out.println("Calling static");
		return "SomeDefault";
	}

	void consume(String arg1);

	default String someDefault() {
		System.out.println("Calling default");
		return "someDefault";
	}
}

