package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.exception.Summary;

import java.util.List;

public class PrintingServiceImplementation implements PrintingService {

	@Override
	public void printInputDataInfo(final InputData inputData) {
		final String message = NEW_LINE + MORTGAGE_AMOUNT + inputData.getAmount() + CURRENCY +
				NEW_LINE +
				MORTGAGE_PERIOD + inputData.getMonthsDuration() + MONTHS +
				NEW_LINE +
				INTEREST + inputData.getInterestDisplay() + PERCENT +
				NEW_LINE;
		printMessage(message);
	}

	@Override
	public void printRates(final List<Rate> rates) {
		final String format = "%4s %3s "
				+ "%4s %3s "
				+ "%4s %2s "
				+ "%4s %2s "
				+ "%4s %8s "
				+ "%4s %8s "
				+ "%4s %10s "
				+ "%4s %10s "
				+ "%4s %3s ";

		for (final Rate rate : rates) {
			final String message = String.format(format,
					RATE_NUMBER, rate.getRateNumber(),
					DATE, rate.getTimePoint().getDate(),
					YEAR, rate.getTimePoint().getYear(),
					MONTH, rate.getTimePoint().getMonth(),
					RATE, rate.getRateAmounts().getRateAmount(),
					INTEREST, rate.getRateAmounts().getInterestAmount(),
					CAPITAL, rate.getRateAmounts().getCapitalAmount(),
					LEFT_AMOUNT, rate.getMortgageResidual().getAmount(),
					LEFT_MONTHS, rate.getMortgageResidual().getDuration()
			);
			printMessage(message);
			if (rate.getRateNumber().intValue() % 12 == 0) {
				System.out.println();
			}
		}
	}

	public void printSummary(final Summary summary) {
		final String msg = NEW_LINE + INTEREST_SUM + summary.getInterestSum() + CURRENCY +
				NEW_LINE;

		printMessage(msg);
	}

	private void printMessage(final String sb) {
		System.out.println(sb);
	}
}
