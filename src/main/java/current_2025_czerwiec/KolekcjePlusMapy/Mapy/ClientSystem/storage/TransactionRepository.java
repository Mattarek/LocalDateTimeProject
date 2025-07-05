package current_2025_czerwiec.KolekcjePlusMapy.Mapy.ClientSystem.storage;

import current_2025_czerwiec.KolekcjePlusMapy.Mapy.ClientSystem.model.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TransactionRepository {
	private final NavigableMap<LocalDate, List<Transaction>> transactions = new TreeMap<>();

	public void addTransaction(final Transaction transaction) {
		transactions.computeIfAbsent(transaction.getDate(), k -> new ArrayList<>())
				.add(transaction);
	}

	public List<Transaction> getTransactionsByDate(final LocalDate date) {
		return transactions.getOrDefault(date, Collections.emptyList());
	}

	public NavigableMap<LocalDate, List<Transaction>> getTransactionsBetween(final LocalDate from, final LocalDate to) {
		return transactions.subMap(from, true, to, true);
	}
}
