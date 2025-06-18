package current_2025.Lotto.game;

import current_2025.Lotto.generator.NumberGenerator;
import current_2025.Lotto.input.PlayerNumberProvider;
import current_2025.Lotto.output.ResultPrinter;

import java.util.Set;
import java.util.TreeSet;

public class LottoGame {
	private NumberGenerator generator;
	private PlayerNumberProvider playerProvider;
	private ResultPrinter printer;

	public LottoGame(final NumberGenerator generator,
					 final PlayerNumberProvider playerProvider,
					 final ResultPrinter printer) {
		final Set<Integer> playerNumbers = playerProvider.getNumbers();
		final Set<Integer> drawnNumbers = generator.generate();

		final Set<Integer> hits = new TreeSet<>(playerNumbers);
		hits.retainAll(drawnNumbers);

		printer.printResult(playerNumbers, drawnNumbers, hits);
	}
}
