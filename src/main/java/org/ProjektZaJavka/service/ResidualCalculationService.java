package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.MortgageResidual;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.RateAmounts;

public interface ResidualCalculationService {
	MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);

	MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);
}
