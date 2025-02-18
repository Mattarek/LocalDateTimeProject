package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.MortgageReference;
import org.ProjektZaJavka.model.MortgageResidual;
import org.ProjektZaJavka.model.Overpayment;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.RateAmounts;
import org.ProjektZaJavka.model.TimePoint;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class RateCalculationServiceImplementation implements RateCalculationService {
	private final TimePointService timePointService;
	private final AmountsCalculationService amountsCalculationService;
	private final OverpaymentCalculationService overpaymentCalculationService;
	private final ResidualCalculationService residualCalculationService;
	private final ReferenceCalculationService referenceCalculationService;

	public RateCalculationServiceImplementation(final TimePointService timePointService,
												final AmountsCalculationService amountsCalculationService,
												final OverpaymentCalculationService overpaymentCalculationService,
												final ResidualCalculationService residualCalculationService,
												final ReferenceCalculationService referenceCalculationService) {
		this.timePointService = timePointService;
		this.amountsCalculationService = amountsCalculationService;
		this.overpaymentCalculationService = overpaymentCalculationService;
		this.residualCalculationService = residualCalculationService;
		this.referenceCalculationService = referenceCalculationService;
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
		final Overpayment overpayment = overpaymentCalculationService.calculate(inputData);
		final RateAmounts rateAmounts = amountsCalculationService.calculate(inputData, overpayment);
		final MortgageResidual mortgageResidual = residualCalculationService.calculate(rateAmounts, inputData);
		final MortgageReference mortgageReference = referenceCalculationService.calculate();
		return new Rate(rateNumber, timePoint, rateAmounts, mortgageResidual, mortgageReference);
	}

	private Rate calculateRate(final BigDecimal rateNumber, final InputData inputData, final Rate previousRate) {
		final TimePoint timePoint = timePointService.calculate(rateNumber, inputData);
		final Overpayment overpayment = overpaymentCalculationService.calculate(inputData);
		final RateAmounts rateAmounts = amountsCalculationService.calculate(inputData, previousRate, overpayment);
		final MortgageResidual mortgageResidual = residualCalculationService.calculate(rateAmounts, previousRate);
		final MortgageReference mortgageReference = referenceCalculationService.calculate();
		return new Rate(rateNumber, timePoint, rateAmounts, mortgageResidual, mortgageReference);
	}
}
