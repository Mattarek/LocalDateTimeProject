package wzorceProjektowe.Singleton.ExampleTwo;

public class TestDatabase {
	public static void main(final String[] args) {
		final DatabaseConnection firstConnection = DatabaseConnection.getDatabaseConnection();
		firstConnection.printConnectionInfo();

		final DatabaseConnection secondConnection = DatabaseConnection.getDatabaseConnection();
		secondConnection.printConnectionInfo();

		final DatabaseConnection thirdConnection = DatabaseConnection.getDatabaseConnection();
		thirdConnection.printConnectionInfo();

		System.out.println(firstConnection.equals(secondConnection));
		System.out.println(secondConnection.equals(thirdConnection));
		System.out.println(firstConnection.equals(thirdConnection));
	}
}
