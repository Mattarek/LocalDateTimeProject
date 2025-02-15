package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;

public class PrintingServiceImplementation implements PrintingService {

	@Override
	public void printInputDataInfo(final InputData inputData) {
		final StringBuilder message = new StringBuilder(NEW_LINE);
		message.append(MORTGAGE_AMOUNT).append(inputData.getAmount()).append(CURRENCY);
		message.append(NEW_LINE);
		message.append(MORTGAGE_PERIOD).append(inputData.getMonthsDuration()).append(MONTHS);
		message.append(NEW_LINE);
		message.append(INTEREST).append(inputData.getInterestDisplay()).append(PERCENT);
		message.append(NEW_LINE);
		printMessage(message);
	}

	private void printMessage(final StringBuilder sb) {
		System.out.println(sb);
	}
}
