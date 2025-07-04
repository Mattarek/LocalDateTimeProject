package current_2025_czerwiec.megakExercises.Exercise3;

import java.math.BigDecimal;

public class Invoice {
	private final String id;
	private final BigDecimal amount;

	public Invoice(final String id, final BigDecimal amount) {
		this.id = id;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Invoice{" +
				"id='" + id + '\'' +
				", amount=" + amount +
				'}';
	}
}
