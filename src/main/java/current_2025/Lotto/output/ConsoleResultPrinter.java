package current_2025.Lotto.output;

import java.util.Set;

public class ConsoleResultPrinter implements ResultPrinter {
	@Override
	public void printResult(final Set<Integer> playerNumbers, final Set<Integer> drawnNumbers, final Set<Integer> hits) {
		System.out.println("\nTwoje liczby: " + playerNumbers);
		System.out.println("Wylosowane liczby: " + drawnNumbers);
		System.out.println("Trafione liczby: " + hits + " (trafień: " + hits.size() + ")");
	}
}
