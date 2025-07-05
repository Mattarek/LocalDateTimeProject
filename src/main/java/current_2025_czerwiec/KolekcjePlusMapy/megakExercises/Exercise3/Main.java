package current_2025_czerwiec.KolekcjePlusMapy.megakExercises.Exercise3;

import java.util.List;

public class Main {

	public static void main(final String[] args) {
		final List<String> commandList = List.of(
				"CEO: ADD INVOICE(19.20)",
				"CEO: ADD INVOICE(31.40)",
				"ACCOUNTANT: PROCESS INVOICE",
				"CEO: ADD INVOICE(21.20)",
				"CEO: ADD INVOICE(120.99)",
				"ACCOUNTANT: PROCESS INVOICE",
				"ACCOUNTANT: PROCESS INVOICE",
				"ACCOUNTANT: PROCESS INVOICE"
		);

		final InvoiceStack invoiceStack = new InvoiceStack();

		for (final String invoice : commandList) {
			invoiceStack.processInput(invoice);
		}
		System.out.println(invoiceStack);
	}
}
