package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.util.List;
import java.util.stream.Stream;

public class Command {
	private final Type type;
	private final ToDoItem toDoItem;

	public Command(final Type type, final ToDoItem toDoItem) {
		this.type = type;
		this.toDoItem = toDoItem;
	}

	public enum Type {
		CREATE("CREATE"),
		UPDATE("UPDATE"),
		READ("READ"),
		READ_ALL("READ ALL"),
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
					.map(Type::getName).toList();
		}

		public String getName() {
			return name;
		}
	}
}
