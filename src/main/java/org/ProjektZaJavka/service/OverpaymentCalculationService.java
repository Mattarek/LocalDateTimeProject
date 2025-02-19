package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Overpayment;

import java.math.BigDecimal;

public interface OverpaymentCalculationService {

	Overpayment calculate(BigDecimal rateNumber, InputData inputData);
}
