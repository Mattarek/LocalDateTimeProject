package org.ProjektZaJavka;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.service.PrintingService;
import org.ProjektZaJavka.service.PrintingServiceImplementation;

import java.math.BigDecimal;

public class Main {
	private PrintingService printingService;

	public static void main(final String[] args) {
		final InputData inputData =
				new InputData()
						.withAmount(new BigDecimal("298000"))
						.withMonthsDuration(BigDecimal.valueOf(160));

		final PrintingService printingService = new PrintingServiceImplementation();
		printingService.printInputDataInfo(inputData);
	}
}
