package org.ProjektZaJavka;

import org.ProjektZaJavka.model.InputData;
import org.staticInheritence.B;

import java.math.BigDecimal;

public class Main {
	public static void main(final String[] args) {
		final InputData inputData =
				new InputData()
						.withAmount(new BigDecimal("298000"))
						.withMonthsDuration(BigDecimal.valueOf(160));
	}
}
