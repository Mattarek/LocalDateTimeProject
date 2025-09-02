package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.util.Scanner;

public class ScannerRunner {

	static void main(final String[] args) {
		System.out.println("Write command: ");
		final Scanner console = new Scanner(System.in);

		final CommandBuilder commandBuilder = new CommandBuilder();
		final DatabaseRunner databaseRunner = new DatabaseRunner();

		while (console.hasNext()) {
			final String stringCommand = console.nextLine();
			commandBuilder.buildCommand(stringCommand)
					.ifPresent(databaseRunner::run);
		}
	}
}