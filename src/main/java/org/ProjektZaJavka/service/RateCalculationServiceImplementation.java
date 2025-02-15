package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Rate;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class RateCalculationServiceImplementation implements RateCalculationService {
	@Override
	public List<Rate> calculate(final InputData inputData) {
		final List<Rate> rates = new LinkedList<>();
		final BigDecimal rateNumber = BigDecimal.ONE;
		final Rate firstRate = calculateFirstRate(rateNumber, inputData);
		rates.add(firstRate);
		Rate previousRate = firstRate;
		for (BigDecimal index = rateNumber.add(BigDecimal.ONE);
			 index.compareTo(inputData.getMonthsDuration()) <= 0;
			 index = index.add(BigDecimal.ONE)) {
			final Rate nextRate = calculateNextRate(index, inputData, previousRate);
			rates.add(nextRate);
			previousRate = nextRate;
		}

		return rates;
	}

	private Rate calculateFirstRate(final BigDecimal rateNumber, final InputData inputData) {
		return null;
	}

	private Rate calculateNextRate(final BigDecimal index, final InputData inputData, final Rate previousRate) {
		return null;
	}
}
