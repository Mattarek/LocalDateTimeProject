package current_2025.wzorceProjektowe.Singleton.ExampleTwo;

public class DatabaseConnection {
	private static int connectionId;
	private static DatabaseConnection connection;

	private DatabaseConnection() {
		connectionId++;
	}

	public static DatabaseConnection getDatabaseConnection() {
		if (connection == null) {
			connection = new DatabaseConnection();
		}
		return connection;
	}

	public void printConnectionInfo() {
		System.out.println("Database connection with id: " + connectionId);
	}
}
