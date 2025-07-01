package current_2025_czerwiec.Mapy.ClientSystem;

import current_2025_czerwiec.Mapy.ClientSystem.model.Client;
import current_2025_czerwiec.Mapy.ClientSystem.model.Transaction;
import current_2025_czerwiec.Mapy.ClientSystem.storage.ClientRepository;
import current_2025_czerwiec.Mapy.ClientSystem.storage.TransactionRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
	public static void main(final String[] args) {
		final ClientRepository clientRepo = new ClientRepository();
		final TransactionRepository transactionRepo = new TransactionRepository();

		clientRepo.addClient(new Client(1, "Marcin", "Barć"));
		clientRepo.addClient(new Client(2, "Anna", "Kowalska"));
		clientRepo.addClient(new Client(3, "Zofia", "Nowak"));

		transactionRepo.addTransaction(new Transaction(1, 1, new BigDecimal("120.50"), LocalDate.of(2024, 1, 10)));
		transactionRepo.addTransaction(new Transaction(2, 2, new BigDecimal("75.00"), LocalDate.of(2024, 1, 15)));
		transactionRepo.addTransaction(new Transaction(3, 1, new BigDecimal("300.00"), LocalDate.of(2024, 1, 20)));

		System.out.println("=== Wszyscy klienci (HashMap) ===");
		clientRepo.getAllClients().forEach(System.out::println);

		System.out.println("\n=== Klienci posortowani (TreeMap) ===");
		clientRepo.getClientsSortedByLastName().forEach(System.out::println);

		System.out.println("\n=== Historia operacji (LinkedHashMap) ===");
		clientRepo.getOperationLog().forEach((id, log) -> System.out.println("[" + id + "]: " + log));

		System.out.println("\n=== Transakcje z zakresu dat (NavigableMap) ===");
		transactionRepo.getTransactionsBetween(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31))
				.forEach((date, list) -> {
					System.out.println(date + ": ");
					list.forEach(System.out::println);
				});
	}
}
