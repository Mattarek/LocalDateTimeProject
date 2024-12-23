package org.kalkulator;

import java.util.Scanner;

public class main {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(final String[] args) {
		int numberA = getNumber();

		while (true) {
			System.out.println("Podaj sposób działania: +,-,/,*");
			final String operator = scanner.next();

			final int numberB = getNumber();

			if (numberB == 0) {
				break;
			}

			switch (operator) {
				case "+":
					numberA += numberB;
					break;
				case "-":
					numberA -= numberB;
					break;
				case "*":
					numberA *= numberB;
					break;
				case "/":
					if (numberB != 0) {
						numberA /= numberB;
					} else {
						System.out.println("Nie można dzielić przez zero.");
					}
					break;
				default:
					System.out.println("Nie podałeś poprawnego znaku, skorzystaj z: +,-,*,/");
			}
		}
		System.out.println("Aktualny wynik: " + numberA);
	}

	//  Wersja z regexem
	//	public static int getNumber() {
	//		while (true) {
	//			String number;
	//			while (true) {
	//				System.out.println("Podaj liczbę:");
	//				number = scanner.next();
	//				if (number.matches("^\\d*$") && number.length() < 11) {
	//					return Integer.parseInt(number);
	//				}
	//				System.out.println("Nieprawidłowa wartość!");
	//			}
	//		}
	//	}

	public static int getNumber() {
		while (true) {
			System.out.println("Podaj liczbę:");
			final String value = scanner.next();
			if (isCorrect(value)) {
				return Integer.parseInt(value);
			}
			System.out.println("Niepoprawna wartość! Nie wykonam obliczenia!");
			return 0;
		}
	}

	public static boolean isCorrect(final String value) {
		if (value.matches("[0-9]+") && value.length() < 11) {
			int valueInt = 0;
			for (int i = 0; i < value.length(); i++) {
				valueInt += Character.getNumericValue(value.charAt(i));
			}
			return valueInt > 0;
		}
		return false;
	}
}
