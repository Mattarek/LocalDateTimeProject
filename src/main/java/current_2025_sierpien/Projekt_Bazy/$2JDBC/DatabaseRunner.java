package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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
			= "UPDATE TODOLIST SET DESCRIPTION = ?, DEADLINE = ?, PRIORITY = ? WHERE NAME = ?;";

	private static final String SQL_READ_WHERE = "SELECT * FROM TODOLIST WHERE NAME = ?;";

	// W ten sposób nie możemy przygotować statementu, ponieważ wtedy podstawiane są wartości
	// w 'ciapkach', przez co zapytanie jest niepoprawne. Pytajniki służą głównie do zapytań
	// typu WHERE, do ORDER BY musimy podejść inaczej.
	//	private static final String SQL_READ_ALL = "SELECT * FROM TODOLIST ORDER BY ? ?;";

	private static final String SQL_READ_ALL = "SELECT * FROM TODOLIST ORDER BY ?1 ?2;";

	private static final String SQL_DELETE = "DELETE FROM TODOLIST WHERE NAME = ?;";
	private static final String SQL_GROUPED = "select DATE(deadline) as DATE, ARRAY_AGG(name) AS TASKS" +
			" from TODOLIST GROUP BY DATE(deadline) ORDER BY DATE ASC;";

	private static final String SQL_DELETE_ALL = "DELETE FROM TODOLIST;";

	private final Map<Command.Type, Consumer<Command>> EXECUTION_MAP;

	{
		EXECUTION_MAP = Map.of(
				Command.Type.CREATE, this::runAdd,
				Command.Type.UPDATE, this::runEdit,
				Command.Type.READ_ALL, this::runReadAll,
				Command.Type.READ, this::runRead,
				Command.Type.DELETE_ALL, this::runDeleteAll,
				Command.Type.DELETE, this::runDelete,
				Command.Type.READ_GROUPED, this::runReadGrouped
		);
	}

	private void runReadGrouped(final Command command) {
		if (!Command.Type.READ_GROUPED.equals(command.getType())) {
			throw new IllegalArgumentException(command.getType().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_GROUPED)
		) {
			try (final ResultSet resultSet = statement.executeQuery()) {
				final Map<String, String> grouped = mapToGrouped(resultSet);
				print(grouped);
				System.out.printf("Run [%s] successfully, read: [%s] rows%n", command.getType(), grouped.size());
			} catch (final SQLException e) {
				e.printStackTrace();
			}
		} catch (final SQLException e) {
			System.err.printf("[%s] data error. Message: [%s]%n", command.getType(), e.getMessage());
		}
	}

	private Map<String, String> mapToGrouped(final ResultSet resultSet) throws SQLException {
		final Map<String, String> result = new LinkedHashMap<>();
		while (resultSet.next()) {
			result.put(resultSet.getString("DATE"), resultSet.getString("TASKS"));
		}
		return result;
	}

	public void run(final Command command) {
		System.out.println("##### RUNNING COMMAND #####");
		final Consumer<Command> commandConsumer =
				Optional.ofNullable(EXECUTION_MAP.get(
						command.getType())).orElseThrow(
						() -> new IllegalArgumentException(String.format("Command: [%s] not supported", command.getType())
						));

		commandConsumer.accept(command);
		System.out.println("##### FINISHED COMMAND #####\n");
	}

	private void runRead(final Command command) {
		if (!Command.Type.READ.equals(command.getType())) {
			throw new IllegalArgumentException(command.getType().getName());
		}
		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_READ_WHERE)
		) {
			statement.setString(1, command.getToDoItem().getName());

			try (final ResultSet resultSet = statement.executeQuery()) {
				statement.setString(1, command.getToDoItem().getName());
				final List<ToDoItem> readItems = mapMapToDoItem(resultSet);
				print(readItems);
				System.out.printf("Run: [%s] successfully, read: [%s] rows%n ", command.getType(), readItems.size());
			}
		} catch (final SQLException e) {
			System.err.printf("[%s] data error. Message: [%s]%n", command.getType(), e.getMessage());
		}
	}

	private void runReadAll(final Command command) {
		if (!Command.Type.READ_ALL.equals(command.getType())) {
			throw new IllegalArgumentException(command.getType().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(
						SQL_READ_ALL
								.replace("?1", command.sortBy().name())
								.replace("?2", command.sortDir().name())
				)
		) {
			try (final ResultSet resultSet = statement.executeQuery()) {
				final List<ToDoItem> readItems = mapMapToDoItem(resultSet);
				print(readItems);
				System.out.printf("Run: [%s] successfully, read: [%s] rows%n ", command.getType(), readItems.size());
			}
		} catch (final SQLException e) {
			System.err.printf("[%s] data error. Message: [%s]%n", command.getType(), e.getMessage());
		}
	}

	private void print(final List<ToDoItem> readItems) {
		System.out.println("PRINTING TO DO LIST");
		final String schema = "%-25s%-25s%-25s%-25s%n";
		System.out.printf(schema,
				ToDoItem.Field.NAME.name(),
				ToDoItem.Field.DESCRIPTION.name(),
				ToDoItem.Field.DEADLINE.name(),
				ToDoItem.Field.PRIORITY.name()
		);

		readItems.forEach(entry -> System.out.printf(schema,
				entry.getName(),
				entry.getDescription(),
				entry.getDeadline(),
				entry.getPriority()
		));
	}

	private void print(final Map<String, String> readItems) {
		System.out.println("READ GROUPED");
		final String schema = "%-25s%-25s%n";
		for (final var entry : readItems.entrySet()) {
			System.out.printf(schema, entry.getKey(), entry.getValue());
		}
	}

	private List<ToDoItem> mapMapToDoItem(final ResultSet resultSet) throws SQLException {
		final List<ToDoItem> result = new ArrayList<>();
		while (resultSet.next()) {
			final ToDoItem toDoItem = new ToDoItem();
			toDoItem.setName(resultSet.getString(ToDoItem.Field.NAME.name()));
			toDoItem.setDescription(resultSet.getString(ToDoItem.Field.DESCRIPTION.name()));
			toDoItem.setDeadline(resultSet.getTimestamp(ToDoItem.Field.DEADLINE.name()).toLocalDateTime());
			toDoItem.setPriority(resultSet.getInt(ToDoItem.Field.PRIORITY.name()));
			result.add(toDoItem);
		}

		return result;
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
			System.out.printf("Run: [%s] successfully, changed: [%s] rows%n ", command.getType(), count);
		} catch (final SQLException e) {
			System.err.printf("[%s] data error. Message: [%s]%n", command.getType(), e.getMessage());
		}
	}

	private void runDeleteAll(final Command command) {
		if (!Command.Type.DELETE_ALL.equals(command.getType())) {
			throw new IllegalArgumentException(command.getType().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_DELETE_ALL)
		) {
			final int count = statement.executeUpdate();
			System.out.printf("Run: [%s] successfully, deleted: [%s] rows%n ", command.getType(), count);
		} catch (final SQLException e) {
			System.err.printf("[%s] data error. Message: [%s]%n", command.getType(), e.getMessage());
		}
	}

	private void runDelete(final Command command) {
		if (!Command.Type.DELETE.equals(command.getType())) {
			throw new IllegalArgumentException(command.getType().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_DELETE)
		) {
			statement.setString(1, command.getToDoItem().getName());
			final int count = statement.executeUpdate();
			System.out.printf("Run: [%s] successfully, deleted: [%s] rows%n ", command.getType(), count);
		} catch (final SQLException e) {
			System.err.printf("[%s] data error. Message: [%s]%n", command.getType(), e.getMessage());
		}
	}

	private void runEdit(final Command command) {
		if (!Command.Type.UPDATE.equals(command.getType())) {
			throw new IllegalArgumentException(command.getType().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_UPDATE)
		) {
			statement.setString(1, command.getToDoItem().getDescription());
			statement.setTimestamp(2, Timestamp.valueOf(command.getToDoItem().getDeadline()));
			statement.setInt(3, command.getToDoItem().getPriority());
			statement.setString(4, command.getToDoItem().getName());
			final int count = statement.executeUpdate();
			System.out.printf("Run: [%s] successfully, deleted: [%s] rows%n ", command.getType(), count);
		} catch (final SQLException e) {
			System.err.printf("[%s] data error. Message: [%s]%n", command.getType(), e.getMessage());
		}
	}
}
