package org.ProjektZaJavka.service;

import org.ProjektZaJavka.model.InputData;
import org.ProjektZaJavka.model.Rate;
import org.ProjektZaJavka.model.exception.Summary;

import java.util.List;

public interface PrintingService {

	String INTEREST_SUM = "SUMA ODSETEK: ";
	String OVERPAYMENT_PROVISION = "PROWIZJA ZA NADPLATY: ";
	String LOSTS_SUM = "SUMA STRAT: ";
	String CAPITAL_SUM = "SUMA KAPITALU: ";
	String RATE_NUMBER = "NR: ";
	String YEAR = "ROK: ";
	String MONTH = "MIESIAC: ";
	String AMOUNT = "KWOTA: ";
	String DATE = "DATA: ";
	String MONTHS = " MIESIECY ";
	String OVERPAYMENT_REDUCE_RATE = "NADPLATA, ZMNIEJSZENIE RATY";
	String OVERPAYMENT_REDUCE_PERIOD = "NADPLATA, SKROCENIE OKRESU";
	String RATE = "RATA: ";
	String INTEREST = "ODSETKI: ";
	String CAPITAL = "KAPITAL: ";
	String OVERPAYMENT = "NADPLATA: ";
	String LEFT_AMOUNT = "PKWT: ";
	String LEFT_MONTHS = "PMSC: ";
	String BLANK = " ";
	String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
	String MORTGAGE_PERIOD = "OKRES KREDYTOWANIA: ";
	String OVERPAYMENT_START_MONTH = "MIESIAC ROZPOCZECIA NADPLAT: ";
	String OVERPAYMENT_FREQUENCY = "SCHEMAT DOKONYWANIA NADPLAT: ";

	String CURRENCY = " ZL ";
	String COMMA = ", ";
	String NEW_LINE = "\n";
	String PERCENT = "% ";

	void printInputDataInfo(final InputData inputData);

	void printRates(List<Rate> rates);

	void printSummary(Summary summary);
}
