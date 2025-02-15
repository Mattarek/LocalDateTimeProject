package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Rate;

import java.util.List;

public class MortgageCalculationImplementation implements MortgageCalculationService {
	private final PrintingService printingService;
	private final RateCalculationService rateCalculationService;

	public MortgageCalculationImplementation(final PrintingService printingService, final RateCalculationService rateCalculationService) {
		this.printingService = printingService;
		this.rateCalculationService = rateCalculationService;
	}

	@Override
	public void calculate(final InputData inputData) {
		printingService.printInputDataInfo(inputData);
		final List<Rate> calculate = rateCalculationService.calculate(inputData);
	}
}
