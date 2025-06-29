package current_2025_maj.Lotto.output;

import java.util.Set;

public interface ResultPrinter {
	void printResult(Set<Integer> playerNumbers, Set<Integer> drawnNumbers, Set<Integer> bits);
}
