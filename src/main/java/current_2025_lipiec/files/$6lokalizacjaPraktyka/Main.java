package current_2025_lipiec.files.$6lokalizacjaPraktyka;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Main {
	public static void main(final String[] args) {
		//		final int amountOfMoney = 1_435_123;
		//		final NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.UK);
		//		System.out.println(Locale.getDefault());
		//		System.out.println(numberFormat.format(amountOfMoney));

		//=================================================================
		final LocalDateTime localDateTime = LocalDateTime.of(2022, Month.AUGUST, 2, 23, 12);
		final DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		final DateTimeFormatter formatterLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		final DateTimeFormatter formatterMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		final DateTimeFormatter formatterShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

		System.out.println(formatter.format(localDateTime));
		System.out.println(formatterLong.format(localDateTime));
		System.out.println(formatterMedium.format(localDateTime));
		System.out.println(formatterShort.format(localDateTime));
		//======================================================================
		final LocalDateTime localDateTime1 = LocalDateTime.of(2000, Month.NOVEMBER, 20, 15, 12);
		final DateTimeFormatter formatter1 = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.SHORT)
				.withLocale(new Locale("pl", "PL"));
		System.out.println(formatter1.format(localDateTime1));
	}
}
