package org.ProjektZaJavka.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TimePoint {
	private final LocalDate date;
	private final BigDecimal year;
	private final BigDecimal month;

	public TimePoint(final LocalDate date, final BigDecimal year, final BigDecimal month) {
		this.date = date;
		this.year = year;
		this.month = month;
	}

	public LocalDate getDate() {
		return date;
	}

	public BigDecimal getYear() {
		return year;
	}

	public BigDecimal getMonth() {
		return month;
	}

	@Override
	public String toString() {
		return "TimePoint{" +
				"date=" + date +
				", year=" + year +
				", month=" + month +
				'}';
	}
}
