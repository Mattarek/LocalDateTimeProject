package SOLID.D.MySQLDobre;

//Zalety:
//UserService zależy od interfejsu Database, a nie od konkretnej klasy.
//Możesz podmienić Database bez zmieniania UserService.
public class UserService {
	private final Database db;

	public UserService(final Database db) {
		this.db = db;
	}

	void registerUser(final String name) {
		db.save(name);
	}
}
