package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.Podsumowanie;

import java.util.function.Supplier;

public class LmabdaVsExceptions {
	public static void main(final String[] args) {
		final Supplier<String> str1 = () -> {
			try {
				return stringCreationChecked();
			} catch (final Exception e) {
				throw new RuntimeException(e);
			}
		};
		final Supplier<String> str2 = LmabdaVsExceptions::stringCreationUnChecked;
	}

	private static String stringCreationChecked() throws Exception {
		return "stringCreationChecked";
	}

	private static String stringCreationUnChecked() throws RuntimeException {
		return "stringCreationUnChecked";
	}
}
