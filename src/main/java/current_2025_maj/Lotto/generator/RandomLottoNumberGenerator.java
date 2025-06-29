package current_2025_maj.Lotto.generator;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomLottoNumberGenerator implements NumberGenerator {
	private final int numbersToDraw;
	private final int maxNumber;

	public RandomLottoNumberGenerator(final int numbersToDraw, final int maxNumber) {
		this.numbersToDraw = numbersToDraw;
		this.maxNumber = maxNumber;
	}

	@Override
	public Set<Integer> generate() {
		final Set<Integer> numbers = new TreeSet<>();
		final Random random = new Random();

		while (numbers.size() < numbersToDraw) {
			numbers.add(random.nextInt(maxNumber) + 1);
		}
		return numbers;
	}
}
