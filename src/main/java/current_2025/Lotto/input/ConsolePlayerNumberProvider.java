package current_2025.Lotto.input;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ConsolePlayerNumberProvider implements PlayerNumberProvider {
	private final int numbersToPick;
	private final int maxNumber;
	private final Scanner scanner = new Scanner(System.in);

	public ConsolePlayerNumberProvider(final int numbersToPick, final int maxNumber) {
		this.numbersToPick = numbersToPick;
		this.maxNumber = maxNumber;
	}

	@Override
	public Set<Integer> getNumbers() {
		final Set<Integer> numbers = new TreeSet<>();
		System.out.println("Podaj " + numbersToPick + " unikalnych liczb od 1 do " + maxNumber + ":");
		while (numbers.size() < numbersToPick) {
			try {
				System.out.println("> ");
				final int number = Integer.parseInt(scanner.nextLine());
				if (number < 2 || number > maxNumber) {
					System.out.println("Liczba poza zakresem!");
				} else if (!numbers.add(number)) {
					System.out.println("Liczba już została podana!");
				}
			} catch (final NumberFormatException e) {
				System.out.println("To nie jest liczba!");
			}
		}
		return numbers;
	}
}
