package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.RateAmounts;

public interface AmountsCalculationService {
	RateAmounts calculate(InputData inputData);

	RateAmounts calculate(InputData inputData, Rate previousRate);
}
