package org.BigIntAndBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
	public static void main(final String[] args) {
		//		// Jak możemy stworzyć BigDecimala
		//		System.out.println(BigDecimal.ZERO);
		//		System.out.println(BigDecimal.ONE);
		//		System.out.println(BigDecimal.TWO);
		//		System.out.println(BigDecimal.TEN);
		//		System.out.println(BigDecimal.valueOf(2345.1231231));
		//		System.out.println(new BigDecimal("12321313123213.112512521512512"));
		//		System.out.println(new BigDecimal(Double.MAX_VALUE));
		//
		//		// Dodawanie BigDecimali
		//		// setScale do wyznaczania ilości po przecinku.
		//		// RoundingMode, sposób zaokrąglania
		//		final BigDecimal bd1 = BigDecimal.valueOf(10.0).setScale(10, RoundingMode.HALF_UP); // jeśli chcemy liczby po przecinku
		//		final BigDecimal bd2 = BigDecimal.valueOf(3);
		//		final BigDecimal bd3 = bd1.add(bd2);
		//		System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP));
		//		System.out.println(bd3);
		//		System.out.println(bd1.compareTo(bd2));

		// =================================================================
		//		final BigDecimal bd1 = new BigDecimal("10");
		//		final BigDecimal bd2 = new BigDecimal("10");
		//
		//		final BigDecimal bd3 = BigDecimal.valueOf(10);
		//		final BigDecimal bd4 = BigDecimal.valueOf(10);
		//
		//		System.out.println(bd1 == bd2); // false, to są wie różne referencje
		//		System.out.println(bd3 == bd4); // true, tu porównujemy prymitywne wartosci
		//		System.out.println(bd1.equals(bd2)); // true

		// =================================================================
		//	    Aproksymacja
		//		Dlaczego tak się dzieje?
		//
		//		Wynika to z reprezentacji liczb zmiennoprzecinkowych w systemie binarnym. Komputery przechowują liczby
		//		w systemie dwójkowym (binarnym), a niektórych wartości dziesiętnych, takich jak 0.1 czy 0.2, nie da się
		//		przedstawić dokładnie jako skończone ułamki binarne. Z tego powodu pojawiają się błędy zaokrągleń.
		//				Przykład w systemie binarnym:
		//
		//		0.1 w systemie binarnym to nieskończony ułamek:
		//		0.0001100110011001100110011001100110011... (wzór się powtarza)
		//		0.2 ma podobną reprezentację binarną.
		//
		//		Gdy komputer dokonuje operacji 0.2 + 0.1, wartości te są najpierw aproksymowane w postaci liczby
		//	zmiennoprzecinkowej (IEEE 754), co prowadzi do błędów zaokrąglenia. Efektem jest wynik 0.30000000000000004
		//			, zamiast oczekiwanego 0.3.
		final double a = 0.1;
		final double b = 0.2;
		final double c = a + b;
		System.out.println(c); // 0.30000000000000004

		// =================================================================
		// Tego problemu nie ma w BigDecimal
		// Jeśli ważne jest zużycie godzin, razem z dokładnością do 0.1 godziny, to nie można korzystac z dobule
		// bo ten wynik też będzie przeklamany
		final BigDecimal bigDecimalOne = new BigDecimal("0.1");
		final BigDecimal bigDecimalTwo = new BigDecimal("0.2");
		System.out.println(bigDecimalOne.add(bigDecimalTwo)); // 0.3
	}
}
