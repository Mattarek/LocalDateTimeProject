package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Overpayment;

public interface OverpaymentCalculationService {

	Overpayment calculate(InputData inputData);
}
