package org.ProjektZaJavka.model;

import java.math.BigDecimal;

public class Rate {
	private final BigDecimal rateNumber;
	private final TimePoint timePoint;
	private final RateAmounts rateAmounts;
	private final MortgageResidual mortgageResidual;

	public Rate(final BigDecimal rateNumber, final TimePoint timePoint,
				final RateAmounts rateAmounts, final MortgageResidual mortgageResidual) {
		this.rateNumber = rateNumber;
		this.mortgageResidual = mortgageResidual;
		this.rateAmounts = rateAmounts;
		this.timePoint = timePoint;
	}
}
