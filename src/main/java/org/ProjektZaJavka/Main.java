package org.ProjektZaJavka;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.service.MortgageCalculationImplementation;
import org.ProjektZaJavka.service.MortgageCalculationService;
import org.ProjektZaJavka.service.PrintingService;
import org.ProjektZaJavka.service.PrintingServiceImplementation;
import org.ProjektZaJavka.service.RateCalculationService;
import org.ProjektZaJavka.service.RateCalculationServiceImplementation;

import java.math.BigDecimal;

public class Main {

	public static void main(final String[] args) {
		final InputData inputData =
				new InputData()
						.withAmount(new BigDecimal("298000"))
						.withMonthsDuration(BigDecimal.valueOf(160));

		final PrintingService printingService = new PrintingServiceImplementation();
		final RateCalculationService rateCalculationService = new RateCalculationServiceImplementation();
		printingService.printInputDataInfo(inputData);

		final MortgageCalculationService mortgageCalculationService =
				new MortgageCalculationImplementation(printingService, rateCalculationService);
		mortgageCalculationService.calculate(inputData);
	}
}
