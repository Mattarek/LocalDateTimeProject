package SOLID.D.MySQLZle;

//Problem:
// UserService zależy bezpośrednio od MySQLDatabase.
// Nie da się łatwo podmienić bazy danych, np. na PostgreSQLDatabase albo InMemoryDatabase.

public class UserService {
	private final MySQLDatabase db = new MySQLDatabase();

	void registerUser(final String name) {
		db.save(name);
	}
}

