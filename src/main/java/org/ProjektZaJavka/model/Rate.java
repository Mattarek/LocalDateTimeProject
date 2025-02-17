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

	public MortgageResidual getMortgageResidual() {
		return mortgageResidual;
	}

	public RateAmounts getAmount() {
		return rateAmounts;
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Rate rate)) {
			return false;
		}
		return Objects.equals(rateNumber, rate.rateNumber) && Objects.equals(timePoint, rate.timePoint) && Objects.equals(rateAmounts, rate.rateAmounts) && Objects.equals(mortgageResidual, rate.mortgageResidual);
	}

	@Override
	public int hashCode() {
		return Objects.hash(rateNumber, timePoint, rateAmounts, mortgageResidual);
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
