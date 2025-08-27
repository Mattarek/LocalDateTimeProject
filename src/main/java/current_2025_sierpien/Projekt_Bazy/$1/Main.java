package current_2025_sierpien.Projekt_Bazy.$1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	static String address = "jdbc:postgresql://127.0.0.1:5432/zajavka";
	static String username = "postgres";
	static String password = "postgres";

	static void main() {
		try (
				final Connection connection = DriverManager.getConnection(address, username, password);
				final Statement statement = connection.createStatement();
				final ResultSet resultSet = statement.executeQuery("")
		) {
			
		} catch (final Exception e) {
		}
	}
}
