package org.ProjektZaJavka.model;

import java.math.BigDecimal;
import java.util.Objects;

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

	public BigDecimal getRateNumber() {
		return rateNumber;
	}

	public TimePoint getTimePoint() {
		return timePoint;
	}

	public RateAmounts getRateAmounts() {
		return rateAmounts;
	}

	public MortgageResidual getMortgageResidual() {
		return mortgageResidual;
	}

	@Override
	public String toString() {
		return "Rate{" +
				"rateNumber=" + rateNumber +
				", timePoint=" + timePoint +
				", rateAmounts=" + rateAmounts +
				", mortgageResidual=" + mortgageResidual +
				'}';
	}
}
