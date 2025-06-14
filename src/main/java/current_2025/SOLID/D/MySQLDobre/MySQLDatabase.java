package current_2025.SOLID.D.MySQLDobre;

public class MySQLDatabase implements Database {
	public void save(final String data) {
		System.out.println("Zapisano do MySQL: " + data);
	}
}
