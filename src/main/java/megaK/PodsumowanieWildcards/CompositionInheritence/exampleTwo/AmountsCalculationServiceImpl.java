package megaK.PodsumowanieWildcards.CompositionInheritence.exampleTwo;

public class AmountsCalculationServiceImpl implements AmountsCalculationService {
	private final ConstantAmountCalculationService constantAmountCalculationService;
	private final DecreasingAmountCalculationService decreasingAmountCalculationService;

	public AmountsCalculationServiceImpl(final ConstantAmountCalculationService constantAmountCalculationService,
										 final DecreasingAmountCalculationService decreasingAmountCalculationService) {
		this.constantAmountCalculationService = constantAmountCalculationService;
		this.decreasingAmountCalculationService = decreasingAmountCalculationService;
	}
}
