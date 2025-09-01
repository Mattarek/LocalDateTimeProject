package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.util.List;
import java.util.stream.Stream;

public record Command(Type type, ToDoItem toDoItem, ToDoItem.Field sortBy, SortDir sortDir) {

	@Override
	public String toString() {
		return "Command{" +
				"type=" + type +
				", toDoItem=" + toDoItem +
				'}';
	}

	public Type getType() {
		return type;
	}

	@Override
	public Type type() {
		return type;
	}

	@Override
	public SortDir sortDir() {
		return sortDir;
	}

	@Override
	public ToDoItem toDoItem() {
		return toDoItem;
	}

	public ToDoItem getToDoItem() {
		return toDoItem;
	}

	public enum Type {
		CREATE("CREATE"),
		UPDATE("UPDATE"),
		READ("READ"),
		READ_ALL("READ ALL"),
		READ_GROUPED("READ GROUPED"),
		DELETE("DELETE"),
		DELETE_ALL("DELETE ALL");

		private final String name;

		Type(final String name) {
			this.name = name;
		}

		public static List<String> valuesAsList() {
			//			👉 values() nie jest zwykłą metodą, którą sam musisz napisać.
			//					W Javie każdy enum automatycznie dostaje statyczną metodę values(),
			//			która zwraca tablicę wszystkich elementów tego enuma w kolejności ich deklaracji.
			return Stream.of(values())
					.map(Type::getName)
					.toList();
		}

		public static Type from(final String commandType) {
			for (final Type type : values()) {
				if (type.name.equals(commandType)) {
					return type;
				}
			}
			throw new IllegalArgumentException(commandType);
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
