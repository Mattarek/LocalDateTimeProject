package current_2025_czerwiec.KolekcjePlusMapy.megakExercises.Exercise3;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;

public class InvoiceStack {
	private final Deque<Invoice> invoiceStack = new ArrayDeque<>();
	private Integer counter = 1;

	public void processInput(final String commond) {
		if (commond.contains("CEO: ADD INVOICE")) {
			processCEOInput(commond);
		} else if ("ACCOUNTANT: PROCESS INVOICE".equals(commond)) {
			// w tym else if ^ lepiej gdy zaczynamy od Stringa, bo jeśli
			// commond będzie nullem to nie spowoduje to problemu
			processAccountantInput(commond);
		} else {
			System.out.println("O co Ci chodzi?");
		}
	}

	private void processCEOInput(final @NotNull String commond) {
		final BigDecimal amount = new BigDecimal(commond.substring(commond.indexOf('(') + 1, commond.indexOf(')')));
		final int year = LocalDate.now().getYear();
		final String id = counter + "/" + year;
		counter++;
		final Invoice invoice = new Invoice(id, amount);
		invoiceStack.push(invoice);

		System.out.printf("%n%s%n", commond);
		System.out.printf("CEO addded invoice ID: %s, amount: %s%n", id, amount);
		System.out.printf("Current invoices amount: %s. Invoices: %s%n", getInvoicesSum(), invoiceStack);
	}

	private void processAccountantInput(final String commond) {
		if (invoiceStack.isEmpty()) {
			System.out.println("Stack empty. No work for Accountant.");
			return;
		}

		final Invoice invoice = invoiceStack.pop();
		System.out.printf("%n%s%n", commond);
		System.out.printf("ACCOUNTANT addded invoice ID: %s%n", invoice);
		System.out.printf("Current invoices amount: %s. Invoices: %s%n", getInvoicesSum(), invoiceStack);
	}

	@Override
	public String toString() {
		return "InvoiceStack{" +
				"invoiceStack=" + invoiceStack +
				", counter=" + counter +
				'}';
	}

	private String getInvoicesSum() {
		BigDecimal sum = BigDecimal.ZERO;
		for (final Invoice invoice : invoiceStack) {
			sum = sum.add(invoice.getAmount());
		}
		return sum.toString();
	}
}
