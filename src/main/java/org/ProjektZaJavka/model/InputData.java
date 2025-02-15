package org.ProjektZaJavka.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class InputData {
	private final LocalDate repaymentStartDate = LocalDate.of(2020, 1, 6);
	private final BigDecimal wiborPercent = new BigDecimal("1,73");
	private final BigDecimal amount = new BigDecimal("300000");
	private final BigDecimal monthsDuration = BigDecimal.valueOf(180);
	private final RateType rateType = RateType.CONSTANT;
	private final BigDecimal bankMargin = new BigDecimal("1.9");

	public LocalDate getRepaymentStartDate() {
		return repaymentStartDate;
	}

	public BigDecimal getWiborPercent() {
		return wiborPercent;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public BigDecimal getMonthsDuration() {
		return monthsDuration;
	}

	public RateType getRateType() {
		return rateType;
	}

	public BigDecimal getBankMargin() {
		return bankMargin;
	}

	@Override
	public String toString() {
		return "InputData{" +
				"repaymentStartDate=" + repaymentStartDate +
				", wiborPercent=" + wiborPercent +
				", amount=" + amount +
				", monthsDuration=" + monthsDuration +
				", rateType=" + rateType +
				", bankMargin=" + bankMargin +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final InputData inputData)) {
			return false;
		}
		return Objects.equals(repaymentStartDate, inputData.repaymentStartDate) && Objects.equals(wiborPercent, inputData.wiborPercent) && Objects.equals(amount, inputData.amount) && Objects.equals(monthsDuration, inputData.monthsDuration) && rateType == inputData.rateType && Objects.equals(bankMargin, inputData.bankMargin);
	}

	@Override
	public int hashCode() {
		return Objects.hash(repaymentStartDate, wiborPercent, amount, monthsDuration, rateType, bankMargin);
	}
}
