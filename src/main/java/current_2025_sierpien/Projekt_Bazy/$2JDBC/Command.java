package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record Command(Type type, ToDoItem toDoItem, ToDoItem.Field sortBy, SortDir sortDir) {

	@Override
	public String toString() {
		return "Command{" +
				"type=" + type +
				", toDoItem=" + toDoItem +
				'}';
	}

	public enum Type {
		CREATE("CREATE"),
		UPDATE("UPDATE"),
		READ("READ"),
		READ_ALL("READ ALL"),
		READ_GROUPED("READ GROUPED"),
		DELETE("DELETE"),
		DELETE_ALL("DELETE ALL"),
		COMPLETED("COMPLETED");

		private final String name;

		Type(final String name) {
			this.name = name;
		}

		public static List<String> valuesAsList() {
			return Stream.of(values())
					.map(Type::getName)
					.collect(Collectors.toList());
		}

		public static Type from(final String input) {
			for (final Type type : values()) {
				if (type.name.equals(input)) {
					return type;
				}
			}
			throw new IllegalArgumentException(input);
		}

		public String getName() {
			return name;
		}
	}

	public enum SortDir {
		ASC,
		DESC
	}
}