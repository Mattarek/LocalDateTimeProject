package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Overpayment;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.RateAmounts;

public interface AmountsCalculationService {
	RateAmounts calculate(InputData inputData, Overpayment overpayment);

	RateAmounts calculate(InputData inputData, Rate previousRate, Overpayment overpayment);
}
