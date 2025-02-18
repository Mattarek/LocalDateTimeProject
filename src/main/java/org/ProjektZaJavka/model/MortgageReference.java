package org.ProjektZaJavka.model;

import java.math.BigDecimal;

public class MortgageReference {
	private final BigDecimal referenceAmount;
	private final BigDecimal referenceDuration;

	public MortgageReference(final BigDecimal referenceDuration, final BigDecimal referenceAmount) {
		this.referenceDuration = referenceDuration;
		this.referenceAmount = referenceAmount;
	}

	public BigDecimal getReferenceAmount() {
		return referenceAmount;
	}

	public BigDecimal getReferenceDuration() {
		return referenceDuration;
	}
}
