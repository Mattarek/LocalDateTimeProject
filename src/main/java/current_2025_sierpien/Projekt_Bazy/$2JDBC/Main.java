package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.util.List;
import java.util.Optional;

public class Main {
	static void main() {
		final List<String> stringCommands = List.of(
				"DELETE ALL;",
				"CREATE;NAME=TASK1;DESCRIPTION=SOME DESCRIPTION1;DEADLINE=11.02.2021 20:10;PRIORITY=0",
				"CREATE;NAME=TASK2;DESCRIPTION=SOME DESCRIPTION2;DEADLINE=12.02.2021 20:10;PRIORITY=1",
				"CREATE;NAME=TASK3;DESCRIPTION=SOME DESCRIPTION3;DEADLINE=13.02.2021 20:10;PRIORITY=2",
				"CREATE;NAME=TASK4;DESCRIPTION=SOME DESCRIPTION4;DEADLINE=14.02.2021 20:10;PRIORITY=3",
				"CREATE;NAME=TASK5;DESCRIPTION=SOME DESCRIPTION5;DEADLINE=15.02.2021 20:10;PRIORITY=4",
				"CREATE;NAME=TASK6;DESCRIPTION=SOME DESCRIPTION5;DEADLINE=13.02.2021 20:10;PRIORITY=5",
				"CREATE;NAME=TASK7;DESCRIPTION=SOME DESCRIPTION5;DEADLINE=14.02.2021 20:10;PRIORITY=6",
				"READ GROUPED;"
		);

		final CommandBuilder commondBuilder = new CommandBuilder();

		final List<Command> commands = stringCommands.stream()
				.map(commondBuilder::buildCommand)
				.filter(Optional::isPresent)
				.map(Optional::get)
				.toList();

		final DatabaseRunner databaseRunner = new DatabaseRunner();
		commands.forEach(databaseRunner::run);
	}
}
