package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.exception.Summary;

import java.util.List;

@FunctionalInterface
public interface SummaryService {
	Summary calculate(List<Rate> rates);
}
