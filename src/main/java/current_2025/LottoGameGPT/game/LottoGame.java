package current_2025.LottoGameGPT.game;

import current_2025.LottoGameGPT.generator.NumberGenerator;
import current_2025.LottoGameGPT.input.PlayerNumberProvider;
import current_2025.LottoGameGPT.output.ResultPrinter;

import java.util.Set;
import java.util.TreeSet;

public class LottoGame {
	private final NumberGenerator generator;
	private final PlayerNumberProvider playerProvider;
	private final ResultPrinter printer;

	public LottoGame(final NumberGenerator generator, final PlayerNumberProvider playerProvider, final ResultPrinter printer) {
		this.generator = generator;
		this.playerProvider = playerProvider;
		this.printer = printer;
	}

	public void play() {
		final Set<Integer> playerNumbers = playerProvider.getNumbers();
		final Set<Integer> drawnNumbers = generator.generate();

		final Set<Integer> hits = new TreeSet<>(playerNumbers);
		hits.retainAll(drawnNumbers);

		printer.printResult(playerNumbers, drawnNumbers, hits);
	}
}
