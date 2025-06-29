package current_2025_maj.Bank;

import current_2025_maj.Bank.exceptions.InsufficientFundsException;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BankAccount {
	private final BigInteger id;
	private final String owner;
	private BigDecimal balance;

	public BankAccount(final BigInteger id, final String owner, final BigDecimal initialBalance) {
		this.id = id;
		this.owner = owner;
		balance = initialBalance;
	}

	public BigInteger getId() {
		return id;
	}

	public String getOwner() {
		return owner;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void deposit(final BigDecimal amount) {
		if (amount.compareTo(BigDecimal.ZERO) > 0) {
			balance = balance.add(amount);
		}
	}

	public boolean withdraw(final BigDecimal amount) throws InsufficientFundsException {
		if (amount.compareTo(BigDecimal.ZERO) > 0 && balance.compareTo(amount) >= 0) {
			balance = balance.subtract(amount);
			return true;
		}
		throw new InsufficientFundsException("Brak środków na koncie.");
	}

	public boolean transferTo(final BankAccount to, final BigDecimal amount) throws InsufficientFundsException {
		if (withdraw(amount)) {
			to.deposit(amount);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Konto #" + id + ", Właściciel: " + owner + ", Saldo: " + balance;
	}
}