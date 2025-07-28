package current_2025_lipiec.files.$5lokalizacja;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
	public static void main(final String[] args) {
		// Locale
		final int number = 1_234_567;
		final Locale localePL = new Locale("pl", "PL");
		final Locale localeUS = Locale.US;
		final Locale localeGB = Locale.GERMANY;

		System.out.println("NumberFormat.getInstance");
		System.out.println("PL: " + NumberFormat.getInstance(localePL).format(number));
		System.out.println("US: " + NumberFormat.getInstance(localeUS).format(number));
		System.out.println("GERMANY: " + NumberFormat.getInstance(localeGB).format(number));
		System.out.println();

		System.out.println("NumberFormat.getNumberInstance");
		System.out.println("PL: " + NumberFormat.getNumberInstance(localePL).format(number));
		System.out.println("US: " + NumberFormat.getNumberInstance(localeUS).format(number));
		System.out.println("GERMANY: " + NumberFormat.getNumberInstance(localeGB).format(number));
		System.out.println();

		System.out.println("NumberFormat.getPercentInstance");
		System.out.println("PL: " + NumberFormat.getPercentInstance(localePL).format(number));
		System.out.println("US: " + NumberFormat.getPercentInstance(localeUS).format(number));
		System.out.println("GERMANY: " + NumberFormat.getPercentInstance(localeGB).format(number));
		System.out.println();

		System.out.println("NumberFormat.getCurrencyInstance");
		System.out.println("PL: " + NumberFormat.getCurrencyInstance(localePL).format(number));
		System.out.println("US: " + NumberFormat.getCurrencyInstance(localeUS).format(number));
		System.out.println("GERMANY: " + NumberFormat.getCurrencyInstance(localeGB).format(number));
	}
}
