package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.StreamsProjektKoncowy;

import java.math.BigDecimal;

public class Money {
	private final BigDecimal value;
	private final Currency currency;

	public Money(final BigDecimal value, final Currency currency) {
		this.value = value;
		this.currency = currency;
	}

	public BigDecimal getValue() {
		return value;
	}

	public Currency getCurrency() {
		return currency;
	}

	@Override
	public String toString() {
		return "Money{" +
				"value=" + value +
				", currency=" + currency +
				'}';
	}

	// konstruktory, gettery itp
	public enum Currency {
		PLN,
		EUR
	}
}