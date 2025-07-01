package current_2025_czerwiec.Mapy.ClientSystem.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
	private final int transactionId;
	private final int clientId;
	private final BigDecimal amount;
	private final LocalDate date;

	public Transaction(final int transactionId, final int clientId, final BigDecimal amount, final LocalDate date) {
		this.transactionId = transactionId;
		this.clientId = clientId;
		this.amount = amount;
		this.date = date;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public int getClientId() {
		return clientId;
	}

	public LocalDate getDate() {
		return date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"transactionId=" + transactionId +
				", clientId=" + clientId +
				", amount=" + amount +
				", date=" + date +
				'}';
	}
}
