package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class DatabaseRunner {

	private static final String URL = "jdbc:postgresql://localhost:5432/zajavka";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "postgres";

	private static final String SQL_INSERT = "INSERT INTO TODOLIST (NAME, DESCRIPTION, DEADLINE, PRIORITY) VALUES (?, ?, ?, ?);";
	private static final String SQL_UPDATE = "UPDATE TODOLIST SET DESCRIPTION = ?, DEADLINE = ?, PRIORITY = ? WHERE NAME = ?;";
	private static final String SQL_READ_WHERE = "SELECT * FROM TODOLIST WHERE NAME = ?;";
	private static final String SQL_READ_ALL = "SELECT * FROM TODOLIST ORDER BY ?1 ?2;";
	private static final String SQL_GROUPED = "SELECT DATE(deadline) AS DATE, ARRAY_AGG(name) AS TASKS FROM TODOLIST GROUP BY DATE(deadline) ORDER BY DATE DESC;";
	private static final String SQL_DELETE = "DELETE FROM TODOLIST WHERE NAME = ?;";
	private static final String SQL_DELETE_ALL = "DELETE FROM TODOLIST;";
	private static final String SQL_COMPLETED = "UPDATE TODOLIST SET STATUS = ? WHERE NAME = ?;";

	private final Map<Command.Type, Consumer<Command>> EXECUTION_MAP;

	{
		EXECUTION_MAP = Map.of(
				Command.Type.CREATE, this::runAdd,
				Command.Type.UPDATE, this::runEdit,
				Command.Type.READ, this::runRead,
				Command.Type.READ_ALL, this::runReadAll,
				Command.Type.READ_GROUPED, this::runGrouped,
				Command.Type.DELETE, this::runDelete,
				Command.Type.DELETE_ALL, this::runDeleteALL,
				Command.Type.COMPLETED, this::runCompleted
		);
	}

	void run(final Command command) {
		System.out.println("##### RUNNING COMMAND #####");
		final Consumer<Command> commandConsumer = Optional.ofNullable(EXECUTION_MAP.get(command.type()))
				.orElseThrow(() -> new IllegalArgumentException(
						String.format("Command: [%s] not supported", command.type())));

		commandConsumer.accept(command);
		System.out.println("##### FINISHED COMMAND #####\n");
	}

	private void runAdd(final Command command) {
		if (!Command.Type.CREATE.equals(command.type())) {
			throw new IllegalArgumentException(command.type().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_INSERT)
		) {
			statement.setString(1, command.toDoItem().getName());
			statement.setString(2, command.toDoItem().getDescription());
			statement.setTimestamp(3, Timestamp.valueOf(command.toDoItem().getDeadline()));
			statement.setInt(4, command.toDoItem().getPriority());
			final int count = statement.executeUpdate();
			System.out.printf("Run [%s] successfully, modified: [%s] rows%n", command.type(), count);
		} catch (final SQLException e) {
			System.err.printf("[%s] error. Message: [%s]%n", command.type(), e.getMessage());
		}
	}

	private void runEdit(final Command command) {
		if (!Command.Type.UPDATE.equals(command.type())) {
			throw new IllegalArgumentException(command.type().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_UPDATE)
		) {
			statement.setString(1, command.toDoItem().getDescription());
			statement.setTimestamp(2, Timestamp.valueOf(command.toDoItem().getDeadline()));
			statement.setInt(3, command.toDoItem().getPriority());
			statement.setString(4, command.toDoItem().getName());
			final int count = statement.executeUpdate();
			System.out.printf("Run [%s] successfully, modified: [%s] rows%n", command.type(), count);
		} catch (final SQLException e) {
			System.err.printf("[%s] error. Message: [%s]%n", command.type(), e.getMessage());
		}
	}

	private void runRead(final Command command) {
		if (!Command.Type.READ.equals(command.type())) {
			throw new IllegalArgumentException(command.type().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_READ_WHERE)
		) {
			statement.setString(1, command.toDoItem().getName());
			try (final ResultSet resultSet = statement.executeQuery()) {
				final List<ToDoItem> readItems = mapToToDoItem(resultSet);
				print(readItems);
				System.out.printf("Run [%s] successfully, read: [%s] rows%n", command.type(), readItems.size());
			}
		} catch (final SQLException e) {
			System.err.printf("[%s] error. Message: [%s]%n", command.type(), e.getMessage());
		}
	}

	private void runReadAll(final Command command) {
		if (!Command.Type.READ_ALL.equals(command.type())) {
			throw new IllegalArgumentException(command.type().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_READ_ALL
						.replace("?1", command.sortBy().name())
						.replace("?2", command.sortDir().name()))
		) {
			try (final ResultSet resultSet = statement.executeQuery()) {
				final List<ToDoItem> readItems = mapToToDoItem(resultSet);
				print(readItems);
				System.out.printf("Run [%s] successfully, read: [%s] rows%n", command.type(), readItems.size());
			}
		} catch (final SQLException e) {
			System.err.printf("[%s] error. Message: [%s]%n", command.type(), e.getMessage());
		}
	}

	private void runGrouped(final Command command) {
		if (!Command.Type.READ_GROUPED.equals(command.type())) {
			throw new IllegalArgumentException(command.type().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_GROUPED)
		) {
			try (final ResultSet resultSet = statement.executeQuery()) {
				final var grouped = mapToGrouped(resultSet);
				print(grouped);
				System.out.printf("Run [%s] successfully, read: [%s] rows%n", command.type(), grouped.size());
			}
		} catch (final SQLException e) {
			System.err.printf("[%s] error. Message: [%s]%n", command.type(), e.getMessage());
		}
	}

	private Map<String, String> mapToGrouped(final ResultSet resultSet) throws SQLException {
		final Map<String, String> result = new LinkedHashMap<>();
		while (resultSet.next()) {
			result.put(resultSet.getString("DATE"), resultSet.getString("TASKS"));
		}
		return result;
	}

	private List<ToDoItem> mapToToDoItem(final ResultSet resultSet) throws SQLException {
		final List<ToDoItem> result = new ArrayList<>();
		while (resultSet.next()) {
			final ToDoItem toDoItem = new ToDoItem();
			toDoItem.setName(resultSet.getString(ToDoItem.Field.NAME.name()));
			toDoItem.setDescription(resultSet.getString(ToDoItem.Field.DESCRIPTION.name()));
			toDoItem.setDeadline(resultSet.getTimestamp(ToDoItem.Field.DEADLINE.name()).toLocalDateTime());
			toDoItem.setPriority(resultSet.getInt(ToDoItem.Field.PRIORITY.name()));
			toDoItem.setStatus(ToDoItem.Status.valueOf(resultSet.getString(ToDoItem.Field.STATUS.name())));
			result.add(toDoItem);
		}
		return result;
	}

	private void print(final List<ToDoItem> readItems) {
		System.out.println("PRINTING TO DO LIST");
		final String schema = "%-25s%-25s%-25s%-25s%-25s%n";
		System.out.printf(schema,
				ToDoItem.Field.NAME,
				ToDoItem.Field.DESCRIPTION.name(),
				ToDoItem.Field.DEADLINE.name(),
				ToDoItem.Field.PRIORITY.name(),
				ToDoItem.Field.STATUS.name());
		readItems.forEach(entry -> System.out.printf(
				schema,
				entry.getName(),
				entry.getDescription(),
				entry.getDeadline(),
				entry.getPriority(),
				entry.getStatus()));
	}

	private void print(final Map<String, String> items) {
		System.out.println("READ GROUPED");
		final String schema = "%-25s%-25s%n";
		System.out.printf(schema, "DATE", "TASKS");
		for (final var entry : items.entrySet()) {
			System.out.printf(schema, entry.getKey(), entry.getValue());
		}
	}

	private void runDelete(final Command command) {
		if (!Command.Type.DELETE.equals(command.type())) {
			throw new IllegalArgumentException(command.type().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_DELETE)
		) {
			statement.setString(1, command.toDoItem().getName());
			final int count = statement.executeUpdate();
			System.out.printf("Run [%s] successfully, modified: [%s] rows%n", command.type(), count);
		} catch (final SQLException e) {
			System.err.printf("[%s] error. Message: [%s]%n", command.type(), e.getMessage());
		}
	}

	private void runDeleteALL(final Command command) {
		if (!Command.Type.DELETE_ALL.equals(command.type())) {
			throw new IllegalArgumentException(command.type().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_DELETE_ALL)
		) {
			final int count = statement.executeUpdate();
			System.out.printf("Run [%s] successfully, modified: [%s] rows%n", command.type(), count);
		} catch (final SQLException e) {
			System.err.printf("[%s] error. Message: [%s]%n", command.type(), e.getMessage());
		}
	}

	private void runCompleted(final Command command) {
		if (!Command.Type.COMPLETED.equals(command.type())) {
			throw new IllegalArgumentException(command.type().getName());
		}

		try (
				final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				final PreparedStatement statement = connection.prepareStatement(SQL_COMPLETED)
		) {
			statement.setString(1, command.toDoItem().getStatus().name());
			statement.setString(2, command.toDoItem().getName());
			final int count = statement.executeUpdate();
			System.out.printf("Run [%s] successfully, modified: [%s] rows%n", command.type(), count);
		} catch (final SQLException e) {
			System.err.printf("[%s] error. Message: [%s]%n", command.type(), e.getMessage());
		}
	}
}
