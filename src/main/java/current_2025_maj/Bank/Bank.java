package current_2025_maj.Bank;

import current_2025_maj.Bank.exceptions.InsufficientFundsException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	private final Map<BigInteger, BankAccount> accounts = new HashMap<>();
	private BigInteger nextId = BigInteger.ONE;

	public static void main() {
		final Bank bank = new Bank();

		final BankAccount userOne = bank.createAccount("Jan", new BigDecimal("1000.00"));
		final BankAccount userTwo = bank.createAccount("Anna", new BigDecimal("500.00"));

		try {
			bank.transfer(userOne.getId(), userTwo.getId(), new BigDecimal("200.00"));
			bank.transfer(userTwo.getId(), userOne.getId(), new BigDecimal("200.00"));
			bank.transfer(userTwo.getId(), userOne.getId(), new BigDecimal("200.00"));
			System.out.println("Po przelewie:");
			System.out.println(userOne.getBalance());
			System.out.println(userOne.getOwner());
			System.out.println(bank.getAccount(userOne.getId()));
			System.out.println(userTwo.getOwner());
		} catch (final InsufficientFundsException e) {
			System.out.println("Błąd przelewu: " + e.getMessage());
		}
	}

	public BankAccount createAccount(final String owner, final BigDecimal initialBalance) {
		final BankAccount account = new BankAccount(nextId, owner, initialBalance);
		accounts.put(nextId, account);
		nextId = nextId.add(BigInteger.ONE);
		return account;
	}

	public BankAccount getAccount(final BigInteger id) {
		return accounts.get(id);
	}

	public boolean transfer(final BigInteger fromId, final BigInteger toId, final BigDecimal amount) throws InsufficientFundsException {
		final BankAccount from = accounts.get(fromId);
		final BankAccount to = accounts.get(toId);

		if (from == null || to == null) {
			System.out.println("Nieprawidłowe ID konta.");
			return false;
		}

		return from.transferTo(to, amount);
	}
}