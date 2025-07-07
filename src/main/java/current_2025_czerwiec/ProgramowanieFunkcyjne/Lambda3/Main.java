package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda3;

public class Main {
	public static void main(final String[] args) {
		final SomeFunctionalInterface impl = v -> {
			System.out.println("Calling... our functional interface");
			return v.contains("qw");
		};
		impl.consume("qwe");
	}
}
