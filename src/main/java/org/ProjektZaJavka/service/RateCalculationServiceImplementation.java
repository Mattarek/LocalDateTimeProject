package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.MortgageResidual;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.RateAmounts;
import org.ProjektZaJavka.model.TimePoint;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class RateCalculationServiceImplementation implements RateCalculationService {
	private final TimePointService timePointService;
	private final AmountsCalculationService amountsCalculationService;
	private final ResidualCalculationService residualCalculationService;

	public RateCalculationServiceImplementation(final TimePointService timePointService, final AmountsCalculationService amountsCalculationService, final ResidualCalculationService residualCalculationService) {
		this.timePointService = timePointService;
		this.amountsCalculationService = amountsCalculationService;
		this.residualCalculationService = residualCalculationService;
	}

	@Override
	public List<Rate> calculate(final InputData inputData) {
		final List<Rate> rates = new LinkedList<>();
		final BigDecimal rateNumber = BigDecimal.ONE;
		final Rate firstRate = calculateRate(rateNumber, inputData);
		rates.add(firstRate);
		Rate previousRate = firstRate;
		for (BigDecimal index = rateNumber.add(BigDecimal.ONE);
			 index.compareTo(inputData.getMonthsDuration()) <= 0;
			 index = index.add(BigDecimal.ONE)) {
			final Rate nextRate = calculateRate(index, inputData, previousRate);
			rates.add(nextRate);
			previousRate = nextRate;
		}

		return rates;
	}

	private Rate calculateRate(final BigDecimal rateNumber, final InputData inputData) {
		final TimePoint timePoint = timePointService.calculate(rateNumber, inputData);
		final RateAmounts rateAmounts = amountsCalculationService.calculate();
		final MortgageResidual mortgageResidual = residualCalculationService.calculate();
		return new Rate(rateNumber, timePoint, rateAmounts, mortgageResidual);
	}

	private Rate calculateRate(final BigDecimal rateNumber, final InputData inputData, final Rate previousRate) {
		final TimePoint timePoint = timePointService.calculate(rateNumber, inputData);
		final RateAmounts rateAmounts = amountsCalculationService.calculate();
		final MortgageResidual mortgageResidual = residualCalculationService.calculate();
		return new Rate(rateNumber, timePoint, rateAmounts, mortgageResidual);
	}
}
