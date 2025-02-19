package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Overpayment;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

public class OverpaymentCalculationServiceImplementation implements OverpaymentCalculationService {

	@Override
	public Overpayment calculate(final BigDecimal rateNumber, final InputData inputData) {
		final BigDecimal overpaymentAmount = calculateAmount(rateNumber, inputData.getOverpaymenySchema()).orElse(BigDecimal.ZERO);
		final BigDecimal overpaymentProvision = calculateProvision(rateNumber, overpaymentAmount, inputData);

		return new Overpayment(overpaymentAmount, overpaymentProvision);
	}

	private BigDecimal calculateProvision(final BigDecimal rateNumber, final BigDecimal overpaymentAmount, final InputData inputData) {
		if (BigDecimal.ZERO.equals(overpaymentAmount)) {
			return BigDecimal.ZERO;
		}

		if (rateNumber.compareTo(inputData.getOverpaymentProvisionMonths()) > 0) {
			return BigDecimal.ZERO;
		}

		return overpaymentAmount.multiply(inputData.getOverpaymentProvisionPercent());
	}

	private Optional<BigDecimal> calculateAmount(final BigDecimal rateNumber, final Map<Integer, BigDecimal> overpaymenySchema) {
		for (final Map.Entry<Integer, BigDecimal> entry : overpaymenySchema.entrySet()) {
			if (rateNumber.equals(BigDecimal.valueOf(entry.getKey()))) {
				return Optional.of(entry.getValue());
			}
		}
		return Optional.empty();
	}

	private BigDecimal calculateProvision() {
		return null;
	}
}

