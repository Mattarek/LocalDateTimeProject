package org.ProjektZaJavka.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class InputData {
	private BigDecimal amount = new BigDecimal("300000");
	private RateType rateType = RateType.CONSTANT;
	private BigDecimal bankMargin = new BigDecimal("1.9");
	private LocalDate repaymentStartDate = LocalDate.of(2020, 1, 6);
	private BigDecimal wiborPercent = new BigDecimal("1,73");
	private BigDecimal monthsDuration = BigDecimal.valueOf(180);

	public InputData withRepaymentStartDate(final LocalDate repaymentStartDate) {
		this.repaymentStartDate = repaymentStartDate;
		return this;
	}

	public InputData withWiborPercent(final BigDecimal wiborPercent) {
		this.wiborPercent = wiborPercent;
		return this;
	}

	public InputData withMonthsDuration(final BigDecimal monthsDuration) {
		this.monthsDuration = monthsDuration;
		return this;
	}

	public InputData withRateType(final RateType rateType) {
		this.rateType = rateType;
		return this;
	}

	public InputData withBankMargin(final BigDecimal bankMargin) {
		this.bankMargin = bankMargin;
		return this;
	}

	public InputData withAmount(final BigDecimal amount) {
		this.amount = amount;
		return this;
	}

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
