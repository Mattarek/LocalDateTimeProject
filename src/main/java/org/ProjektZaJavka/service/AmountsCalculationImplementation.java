package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmountsCalculationImplementation implements AmountsCalculationService {
	public static final BigDecimal YEAR = BigDecimal.valueOf(12);
	private BigDecimal interestAmount;

	@Override
	public RateAmounts calculate(final InputData inputData) {
		switch (inputData.getRateType()) {
			case CONSTANT:
				return calculateConstantRate(inputData);
			case DECREASING:
				return calculateDecreasingRate(inputData);
			default:
				throw new RuntimeException("Case not handled");
		}
	}

	public RateAmounts calculate(final InputData inputData, final Rate previousRate) {
		switch (inputData.getRateType()) {
			case CONSTANT:
				return calculateConstantRate(inputData, previousRate);
			case DECREASING:
				return calculateDecreasingRate(inputData, previousRate);
			default:
				throw new RuntimeException("Case not handled");
		}
	}

	private RateAmounts calculateDecreasingRate(final InputData inputData) {
		final BigDecimal interestPercent = inputData.getInterestPercent();
		final BigDecimal residualAmount = inputData.getAmount();

		final BigDecimal q = calculateQ(interestPercent);

		final BigDecimal rateAmount = calculateConstantRateAmount();
		final BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
		final BigDecimal capitalAmount = calculateConstantCapitalAmount();

		return new RateAmounts(rateAmount, interestAmount, capitalAmount);
	}

	private BigDecimal calculateConstantRateAmount() {
	}

	private BigDecimal calculateConstantCapitalAmount(final BigDecimal rateAmount, final BigDecimal interestAmount) {
		return rateAmount.subtract(interestAmount);
	}

	private BigDecimal calculateInterestAmount(final BigDecimal residualAmount, final BigDecimal interestPercent) {
		return residualAmount.multiply(interestPercent).divide(YEAR, 2, RoundingMode.HALF_UP);
	}

	private RateAmounts calculateConstantRate(final InputData inputData, final Rate previousRate) {
		final BigDecimal interestPercent = inputData.getInterestPercent();
		final BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();

		final BigDecimal q = calculateQ(interestPercent);

		final BigDecimal rateAmount = calculateConstantRateAmount();
		final BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
		final BigDecimal capitalAmount = calculateConstantCapitalAmount();

		return new RateAmounts(rateAmount, interestAmount, capitalAmount);
	}

	private RateAmounts calculateConstantRate(final InputData inputData) {
		final BigDecimal q = calculateQ(inputData.getInterestPercent());

		final BigDecimal rateAmount = calculateConstantRateAmount();
		final BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
		final BigDecimal capitalAmount = calculateConstantCapitalAmount();

		return new RateAmounts(rateAmount, interestAmount, capitalAmount);
	}

	private BigDecimal calculateQ(final BigDecimal interestPercent) {
		return interestPercent.divide(YEAR, 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
	}

	private RateAmounts calculateDecreasingRate(final InputData inputData, final Rate previousRate) {
		return new RateAmounts();
	}
}
