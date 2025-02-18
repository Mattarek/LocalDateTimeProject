package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.MortgageReference;
import org.ProjektZaJavka.model.Rate;

public interface ReferenceCalculationService {
	MortgageReference calculate();

	MortgageReference calculate(Rate previousRate);
}
