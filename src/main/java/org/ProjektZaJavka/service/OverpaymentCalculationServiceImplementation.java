package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Overpayment;

import java.math.BigDecimal;

public class OverpaymentCalculationServiceImplementation implements OverpaymentCalculationService {

	@Override
	public Overpayment calculate(final InputData inputData) {
		final BigDecimal overpaymentAmount = calculateAmount();
		final BigDecimal overpaymentProvision = calculateProvision();
		return new Overpayment(overpaymentAmount, overpaymentProvision);
	}

	private BigDecimal calculateAmount() {
		return null;
	}

	private BigDecimal calculateProvision() {
	}
}

