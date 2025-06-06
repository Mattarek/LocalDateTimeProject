package old_2024.kalkulator;

import java.util.Scanner;

public class main {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(final String[] args) {
		int numberA = getNumber();

		while (true) {
			System.out.println("Podaj sposób działania: +,-,*,/, ^, absolute");
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
				case "^":
					numberA = (int) Math.pow(numberA, numberB);
					break;
				case "absolute":
					System.out.println(Math.abs(numberB));
					break;
				default:
					System.out.println("Nie podałeś poprawnego znaku, skorzystaj z: +,-,*,/, ^, absolute");
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
			System.out.println("To nie jest liczba!");
		}
	}

	public static boolean isCorrect(final String value) {
		if (value.length() >= 11) {
			return false;
		}
		for (int i = 0; i < value.length(); i++) {
			final char addValue = value.charAt(i);
			if (!Character.isDigit(addValue)) {
				return false;
			}
		}
		return true;
	}
}
