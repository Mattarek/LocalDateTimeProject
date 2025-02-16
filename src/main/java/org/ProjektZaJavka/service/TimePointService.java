package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {
	TimePoint calculate(BigDecimal rateNumber, InputData inputData);
}
