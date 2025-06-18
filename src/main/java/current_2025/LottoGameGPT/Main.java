package current_2025.LottoGameGPT;

import current_2025.LottoGameGPT.game.LottoGame;
import current_2025.LottoGameGPT.generator.RandomLottoNumberGenerator;
import current_2025.LottoGameGPT.input.ConsolePlayerNumberProvider;
import current_2025.LottoGameGPT.output.ConsoleResultPrinter;

public class Main {
	public static void main(final String[] args) {
		final int NUMBERS_TO_PICK = 6;
		final int MAX_NUMBER = 49;

		final LottoGame game = new LottoGame(
				new RandomLottoNumberGenerator(NUMBERS_TO_PICK, MAX_NUMBER),
				new ConsolePlayerNumberProvider(NUMBERS_TO_PICK, MAX_NUMBER),
				new ConsoleResultPrinter()
		);

		game.play();
	}
}