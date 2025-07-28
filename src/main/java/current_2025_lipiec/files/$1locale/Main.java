package current_2025_lipiec.files.$1locale;

import java.util.Locale;

public class Main {
	// Internalization - i18n
	// Localization - l10n

	public static void main(final String[] args) {
		final Locale aDefault = Locale.getDefault();
		System.out.println(aDefault);
		System.out.println(Locale.JAPAN);
		System.out.println(Locale.JAPANESE);
		System.out.println(Locale.FRANCE);
		Locale.setDefault(new Locale("pl", "PL"));
	}
}
