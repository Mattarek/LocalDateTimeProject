package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava;

import org.jetbrains.annotations.NotNull;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main(final String[] args) {
		final UnaryOperator<Integer> unaryOperator = UnaryOperatorExample::getString;
		System.out.println(unaryOperator.apply(2));
	}

	private static @NotNull Integer getString(final Integer str) {
		System.out.println("Calling lambda");
		return str + str;
	}
}
