package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.TimePoint;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class TimePointServiceImplementation implements TimePointService {
	public static final BigDecimal YEAR = BigDecimal.valueOf(12);

	private static LocalDate calculateDate(final BigDecimal rateNumber, final InputData inputData) {
		return inputData.getRepaymentStartDate().plusMonths(rateNumber.subtract(BigDecimal.ONE).intValue());
	}

	@Override
	public TimePoint calculate(final BigDecimal rateNumber, final InputData inputData) {
		final LocalDate date = calculateDate(rateNumber, inputData);
		final BigDecimal year = calculateYear(rateNumber);
		final BigDecimal month = calculateMonth(rateNumber);

		return new TimePoint(date, year, month);
	}

	private BigDecimal calculateYear(final BigDecimal rateNumber) {
		return rateNumber.divide(YEAR, RoundingMode.UP).max(BigDecimal.ONE);
	}

	private BigDecimal calculateMonth(final BigDecimal rateNumber) {
		return BigDecimal.ZERO.equals(rateNumber.remainder(YEAR)) ? YEAR : rateNumber.remainder(YEAR);
	}
}
