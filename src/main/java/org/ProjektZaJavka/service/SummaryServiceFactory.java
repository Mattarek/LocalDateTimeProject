package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.exception.Summary;

import java.math.BigDecimal;
import java.util.List;

public class SummaryServiceFactory {

	public static SummaryService create() {
		return rates -> {
			final BigDecimal interestSum = calculateInterestSum(rates);
			return new Summary(interestSum);
		};
	}

	private static BigDecimal calculateInterestSum(final List<Rate> rates) {
		BigDecimal sum = BigDecimal.ZERO;
		for (final Rate rate : rates) {
			sum = sum.add(rate.getRateAmounts().getCapitalAmount());
		}
		return sum;
	}
}
