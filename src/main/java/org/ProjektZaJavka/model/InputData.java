package org.ProjektZaJavka.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Map;

public class InputData {
	private static final BigDecimal PERCENT = BigDecimal.valueOf(100);
	private final Map<Integer, BigDecimal> overpaymenySchema = Map.of(
			5, BigDecimal.valueOf(10000),
			6, BigDecimal.valueOf(10000),
			7, BigDecimal.valueOf(10000),
			8, BigDecimal.valueOf(10000)

	);
	private final String overpaymentReduceWay = Override.REDUCE_PERIOD;
	private final BigDecimal overpaymentProvisionPercent = BigDecimal.valueOf(3);
	private final BigDecimal overpaymentProvisionMonths = BigDecimal.valueOf(36);

	private BigDecimal bankMarginPercent = new BigDecimal("1.9");
	private BigDecimal amount = new BigDecimal("300000");
	private RateType rateType = RateType.CONSTANT;
	private LocalDate repaymentStartDate = LocalDate.of(2020, 1, 6);
	private BigDecimal wiborPercent = new BigDecimal("1.73");
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

	public InputData withBankMarginPercent(final BigDecimal bankMarginPercent) {
		this.bankMarginPercent = bankMarginPercent;
		return this;
	}

	public InputData withAmount(final BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	public LocalDate getRepaymentStartDate() {
		return repaymentStartDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public BigDecimal getMonthsDuration() {
		return monthsDuration;
	}

	public BigDecimal getInterestPercent() {
		return wiborPercent.add(bankMarginPercent).divide(PERCENT, 4, RoundingMode.HALF_UP);
	}

	public BigDecimal getInterestDisplay() {
		return wiborPercent.add(bankMarginPercent).setScale(2, RoundingMode.HALF_UP);
	}

	public RateType getRateType() {
		return rateType;
	}
}
