package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Rate;

import java.util.List;

public interface RateCalculationService {
	List<Rate> calculate(final InputData inputData);
}
