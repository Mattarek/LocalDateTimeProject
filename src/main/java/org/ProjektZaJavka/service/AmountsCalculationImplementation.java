package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Overpayment;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.RateAmounts;
import org.ProjektZaJavka.model.exception.RateCalculateException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmountsCalculationImplementation implements AmountsCalculationService {
	public static final BigDecimal YEAR = BigDecimal.valueOf(12);

	@Override
	public RateAmounts calculate(final InputData inputData) {
		switch (inputData.getRateType()) {
			case CONSTANT:
				return calculateConstantRate(inputData);
			case DECREASING:
				return calculateDecreasingRate(inputData);
			default:
				throw new RateCalculateException("First rate calculation exception.");// alt + j
		}
	}

	@Override
	public RateAmounts calculate(final InputData inputData, final Overpayment overpayment) {
		return null;
	}

	public RateAmounts calculate(final InputData inputData, final Rate previousRate, final Overpayment overpayment) {
		switch (inputData.getRateType()) {
			case CONSTANT:
				return calculateConstantRate(inputData, previousRate);
			case DECREASING:
				return calculateDecreasingRate(inputData, previousRate);
			default:
				throw new RateCalculateException();
		}
	}

	private RateAmounts calculateDecreasingRate(final InputData inputData) {
		final BigDecimal interestPercent = inputData.getInterestPercent();
		final BigDecimal residualAmount = inputData.getAmount();

		final BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
		final BigDecimal capitalAmount = calculateDecreasingCapitalAmount(residualAmount, inputData.getMonthsDuration());
		final BigDecimal rateAmount = capitalAmount.add(interestAmount);

		return new RateAmounts(rateAmount, interestAmount, capitalAmount);
	}

	private RateAmounts calculateDecreasingRate(final InputData inputData, final Rate previousRate) {
		final BigDecimal interestPercent = inputData.getInterestPercent();
		final BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();

		final BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
		final BigDecimal capitalAmount = calculateDecreasingCapitalAmount(inputData.getAmount(), inputData.getMonthsDuration());
		final BigDecimal rateAmount = capitalAmount.add(interestAmount);

		return new RateAmounts(rateAmount, interestAmount, capitalAmount);
	}

	private BigDecimal calculateDecreasingCapitalAmount(final BigDecimal amount, final BigDecimal monthsDuration) {
		return amount.divide(monthsDuration, 2, RoundingMode.HALF_UP);
	}

	private RateAmounts calculateConstantRate(final InputData inputData) {
		final BigDecimal interestPercent = inputData.getInterestPercent();
		final BigDecimal residualAmount = inputData.getAmount();

		final BigDecimal q = calculateQ(inputData.getInterestPercent());

		final BigDecimal rateAmount = calculateConstantRateAmount(q, inputData.getAmount(),
				inputData.getMonthsDuration());
		final BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
		final BigDecimal capitalAmount = calculateConstantCapitalAmount(rateAmount, interestAmount);

		return new RateAmounts(rateAmount, interestAmount, capitalAmount);
	}

	private RateAmounts calculateConstantRate(final InputData inputData, final Rate previousRate) {
		final BigDecimal interestPercent = inputData.getInterestPercent();
		final BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();

		final BigDecimal q = calculateQ(interestPercent);

		final BigDecimal rateAmount = calculateConstantRateAmount(q, inputData.getAmount(), inputData.getMonthsDuration());
		final BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
		final BigDecimal capitalAmount = calculateConstantCapitalAmount(rateAmount, interestAmount);

		return new RateAmounts(rateAmount, interestAmount, capitalAmount);
	}

	private BigDecimal calculateConstantRateAmount(final BigDecimal q, final BigDecimal rateAmount,
												   final BigDecimal monthsDuration) {
		return rateAmount.multiply(q.pow(monthsDuration.intValue())).multiply(q.subtract(BigDecimal.ONE)).divide(q.pow(monthsDuration.intValue()).subtract(BigDecimal.ONE), 2, RoundingMode.HALF_UP);
	}

	private BigDecimal calculateConstantCapitalAmount(final BigDecimal rateAmount, final BigDecimal interestAmount) {
		return rateAmount.subtract(interestAmount);
	}

	private BigDecimal calculateInterestAmount(final BigDecimal residualAmount, final BigDecimal interestPercent) {
		return residualAmount.multiply(interestPercent).divide(YEAR, 50, RoundingMode.HALF_UP);
	}

	private BigDecimal calculateQ(final BigDecimal interestPercent) {
		return interestPercent.divide(YEAR, 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
	}
}
