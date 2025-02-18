package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.MortgageResidual;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.RateAmounts;

import java.math.BigDecimal;

public class ResidualCalculationImplementation implements ResidualCalculationService {
	@Override
	public MortgageResidual calculate(final RateAmounts rateAmounts, final InputData inputData) {
		final BigDecimal residualAmount =
				inputData.getAmount().subtract(rateAmounts.getCapitalAmount().max(BigDecimal.ZERO));
		final BigDecimal residualDuration = inputData.getMonthsDuration().subtract(BigDecimal.ONE);
		return new MortgageResidual(residualAmount, residualDuration);
	}

	@Override
	public MortgageResidual calculate(final RateAmounts rateAmounts, final Rate previousRate) {
		final MortgageResidual residual = previousRate.getMortgageResidual();

		final BigDecimal residualAmount =
				residual.getAmount().subtract(rateAmounts.getCapitalAmount()).max(BigDecimal.ZERO);
		final BigDecimal residualDuration = residual.getDuration().subtract(BigDecimal.ONE);

		return new MortgageResidual(residualAmount, residualDuration);
	}
}
