package org.ProjektZaJavka.model;

import java.math.BigDecimal;

public class RateAmounts {
	private final BigDecimal rateAmount;
	private final BigDecimal interestAmount;
	private final BigDecimal capitalAmount;

	public RateAmounts(final BigDecimal rateAmount, final BigDecimal interestAmount, final BigDecimal capitalAmount) {
		this.rateAmount = rateAmount;
		this.interestAmount = interestAmount;
		this.capitalAmount = capitalAmount;
	}

	public BigDecimal getRateAmount() {
		return rateAmount;
	}

	public BigDecimal getCapitalAmount() {
		return capitalAmount;
	}

	public BigDecimal getInterestAmount() {
		return interestAmount;
	}

	@Override
	public String toString() {
		return "RateAmounts{" +
				"rateAmount=" + rateAmount +
				", interestAmount=" + interestAmount +
				", capitalAmount=" + capitalAmount +
				'}';
	}
}
