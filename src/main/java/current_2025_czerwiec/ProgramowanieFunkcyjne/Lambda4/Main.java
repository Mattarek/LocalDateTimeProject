package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda4;

public class Main {
	public static void main(final String[] args) {
		final SomeFunctionalInterface someFunctionalInterface = arg1 -> {
			System.out.println("Calling our functional interface");
		};
		someFunctionalInterface.consume("qwe");
	}
}
