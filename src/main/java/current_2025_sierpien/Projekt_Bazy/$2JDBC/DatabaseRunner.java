package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class DatabaseRunner {
	private static final String URL = "jdbc:postgresql://localhost:5432/zajavka";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "postgres";

	private static final String SQL_INSERT
			= "INSERT INTO TODOLIST (NAME, DESCRIPTION, DEADLINE, PRIORITY) VALUES (?,?,?,?)";
	private static final String SQL_UPDATE
			= "UPDATE TODOLIST SET DESCRIPTION = ?, DEADLLINE = ?, PRIORITY = ? WHERE NAME = ?;";

	private static final String SQL_READ_WHERE = "SELECT * FROM TODOLIST WHERE NAME = ?;";
	private static final String SQL_READ_ALL = "SELECT * FROM TODOLIST;";

	private static final String SQL_DELETE = "DELETE FROM TODOLIST WHERE NAME = ?;";
	private static final String SQL_DELETE_ALL = "DELETE FROM TODOLIST;";

	private final Map<Command.Type, Consumer<Command>> EXECUTION_MAP;

	{
		EXECUTION_MAP = Map.of(
				Command.Type.CREATE,
				this::runAdd
		)
		;
	}

	public void run(final Command command) {
		System.out.println("##### RUNNING COMMAND #####");
		final Consumer<Command> commandConsumer =
				Optional.ofNullable(EXECUTION_MAP.get(command.getType())).orElseThrow(() -> new IllegalArgumentException(String.format("Command: [%s] not supported", command.getType())));

		commandConsumer.accept(command);
		System.out.println("##### FINISHED COMMAND #####");
	}

	private void runAdd(final Command command) {
		if (!Command.Type.CREATE.equals(command.getType())) {
			throw new IllegalArgumentException(command.getType().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_INSERT)
		) {
			statement.setString(1, command.getToDoItem().getName());
			statement.setString(2, command.getToDoItem().getDescription());
			statement.setTimestamp(3, Timestamp.valueOf(command.getToDoItem().getDeadline()));
			statement.setInt(4, command.getToDoItem().getPriority());
			final int count = statement.executeUpdate();
			System.out.printf("Run: [%s] successfully, inserted: [%s] rows%n ", command.getType(), count);
		} catch (final SQLException e) {
			System.err.printf("INSERT data error. Message: [%s]%n", e.getMessage());
		}
	}
}
