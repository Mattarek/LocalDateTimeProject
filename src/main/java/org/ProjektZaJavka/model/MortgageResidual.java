package org.ProjektZaJavka.model;

import java.math.BigDecimal;

public class MortgageResidual {
	private final BigDecimal amount;
	private final BigDecimal duration;

	public MortgageResidual(final BigDecimal amount, final BigDecimal duration) {
		this.amount = amount;
		this.duration = duration;
	}

	public BigDecimal getDuration() {
		return duration;
	}

	public BigDecimal getAmount() {
		return amount;
	}
}
