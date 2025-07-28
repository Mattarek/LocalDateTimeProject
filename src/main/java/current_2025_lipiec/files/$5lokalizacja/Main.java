package current_2025_lipiec.files.$5lokalizacja;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
	public static void main(final String[] args) {
		//		// Locale
		//		final int number = 1_234_567;
		//		final Locale localePL = new Locale("pl", "PL");
		//		final Locale localeUS = Locale.US;
		//		final Locale localeGB = Locale.GERMANY;
		//
		//		System.out.println("NumberFormat.getInstance");
		//		System.out.println("PL: " + NumberFormat.getInstance(localePL).format(number));
		//		System.out.println("US: " + NumberFormat.getInstance(localeUS).format(number));
		//		System.out.println("GERMANY: " + NumberFormat.getInstance(localeGB).format(number));
		//		System.out.println();
		//
		//		System.out.println("NumberFormat.getNumberInstance");
		//		System.out.println("PL: " + NumberFormat.getNumberInstance(localePL).format(number));
		//		System.out.println("US: " + NumberFormat.getNumberInstance(localeUS).format(number));
		//		System.out.println("GERMANY: " + NumberFormat.getNumberInstance(localeGB).format(number));
		//		System.out.println();
		//
		//		System.out.println("NumberFormat.getPercentInstance");
		//		System.out.println("PL: " + NumberFormat.getPercentInstance(localePL).format(number));
		//		System.out.println("US: " + NumberFormat.getPercentInstance(localeUS).format(number));
		//		System.out.println("GERMANY: " + NumberFormat.getPercentInstance(localeGB).format(number));
		//		System.out.println();
		//
		//		System.out.println("NumberFormat.getCurrencyInstance");
		//		System.out.println("PL: " + NumberFormat.getCurrencyInstance(localePL).format(number));
		//		System.out.println("US: " + NumberFormat.getCurrencyInstance(localeUS).format(number));
		//		System.out.println("GERMANY: " + NumberFormat.getCurrencyInstance(localeGB).format(number));

		// // Formatowanie dat
		//		final LocalDate localDate = LocalDate.of(2010, Month.AUGUST, 2);
		//		final LocalTime localTime = LocalTime.of(12, 52, 10);
		//		final LocalDateTime localDataTime = LocalDateTime.of(localDate, localTime);
		//		System.out.println(localDataTime);
		//
		//		System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
		//		System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
		//		System.out.println(localDataTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		//
		//		final DateTimeFormatter dateTimeFormatterFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		//		final DateTimeFormatter dateTimeFormatterLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		//		final DateTimeFormatter dateTimeFormatterMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		//		final DateTimeFormatter dateTimeFormatterShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//
		//		System.out.println(dateTimeFormatterFull);
		//		System.out.println(dateTimeFormatterLong);
		//		System.out.println(dateTimeFormatterMedium);
		//		System.out.println(dateTimeFormatterShort);

		// // OffsetDateTime - określa przesunięcia
		final LocalDate localDate = LocalDate.of(2010, Month.AUGUST, 2);
		final LocalTime localTime = LocalTime.of(12, 52, 10);
		final LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

		// zone +3h
		final OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(3));
		System.out.println(offsetDateTime);

		// DateTimeFormatter
		//		final DateTimeFormatter dateTimeFormatterFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL); //  Unsupported field: DayOfWeek
		//		final DateTimeFormatter dateTimeFormatterLong = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG); // Unsupported field: DayOfMonth
		//		final DateTimeFormatter dateTimeFormatterMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); // Unsupported field: DayOfMonth
		final DateTimeFormatter dateTimeFormatterShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); // Unsupported field: DayOfMonth

		//		System.out.println("FULL: " + localTime.format(dateTimeFormatterFull));
		//		System.out.println("LONG: " + localTime.format(dateTimeFormatterLong));
		//		System.out.println("MEDIUM: " + localTime.format(dateTimeFormatterMedium));
		System.out.println("SHORT: " + localTime.format(dateTimeFormatterShort));
	}
}
