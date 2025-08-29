package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.util.Optional;

public class CommandBuilder {

	Optional<Command> buildCommand(final String line) {
		final String[] split = line.split(";");
		final String commandType = split[0];
		if (!Command.Type.valuesAsList().contains(commandType)) {
			System.err.printf("User provided unknown command: [%s]%n", commandType);
			return Optional.empty();
		}
		return Optional.empty();
	}
}
