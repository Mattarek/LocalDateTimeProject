package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.exception.Summary;

import java.util.List;

public class MortgageCalculationImplementation implements MortgageCalculationService {
	private final PrintingService printingService;
	private final RateCalculationService rateCalculationService;
	private final SummaryService summaryService;

	public MortgageCalculationImplementation(final PrintingService printingService,
											 final RateCalculationService rateCalculationService, final SummaryService summaryService) {
		this.printingService = printingService;
		this.rateCalculationService = rateCalculationService;
		this.summaryService = summaryService;
	}

	@Override
	public void calculate(final InputData inputData) {
		printingService.printInputDataInfo(inputData);
		final List<Rate> rates = rateCalculationService.calculate(inputData);
		final Summary summary = summaryService.calculate(rates);
		printingService.printSummary(summary);
		printingService.printRates(rates);
	}
}
