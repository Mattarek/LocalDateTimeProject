package megaK.PodsumowanieWildcards.CompositionInheritence.exampleTwo;

public class Main {
	public static void main(final String[] args) {
		final AmountsCalculationServiceImpl amountsCalculationService =
				new AmountsCalculationServiceImpl(new ConstantAmountCalculationServiceImpl(),
						new DecreasingAmountCalculationServiceImpl());
	}
}
