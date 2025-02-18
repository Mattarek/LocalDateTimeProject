package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.Rate;

import java.math.BigDecimal;

public interface Function {
	BigDecimal calculate(Rate rate);
}
