package org.ProjektZaJavka;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.service.AmountsCalculationImplementation;
import org.ProjektZaJavka.service.MortgageCalculationImplementation;
import org.ProjektZaJavka.service.MortgageCalculationService;
import org.ProjektZaJavka.service.OverpaymentCalculationService;
import org.ProjektZaJavka.service.OverpaymentCalculationServiceImplementation;
import org.ProjektZaJavka.service.PrintingService;
import org.ProjektZaJavka.service.PrintingServiceImplementation;
import org.ProjektZaJavka.service.RateCalculationService;
import org.ProjektZaJavka.service.RateCalculationServiceImplementation;
import org.ProjektZaJavka.service.ReferenceCalculationServiceImplementation;
import org.ProjektZaJavka.service.ResidualCalculationImplementation;
import org.ProjektZaJavka.service.SummaryServiceFactory;
import org.ProjektZaJavka.service.TimePointServiceImplementation;

import java.math.BigDecimal;

public class Main {

	public static void main(final String[] args) {
		final InputData inputData =
				new InputData()
						.withAmount(new BigDecimal("298000"))
						.withMonthsDuration(BigDecimal.valueOf(360));

		final PrintingService printingService = new PrintingServiceImplementation();
		final RateCalculationService rateCalculationService = new RateCalculationServiceImplementation(
				new TimePointServiceImplementation(),
				new AmountsCalculationImplementation(),
				new OverpaymentCalculationServiceImplementation(),
				new ResidualCalculationImplementation(),
				new ReferenceCalculationServiceImplementation()
		);

		printingService.printInputDataInfo(inputData);

		final MortgageCalculationService mortgageCalculationService =
				new MortgageCalculationImplementation(printingService, rateCalculationService,
						SummaryServiceFactory.create());
		mortgageCalculationService.calculate(inputData);
	}
}
