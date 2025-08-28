package current_2025_sierpien.Projekt_Bazy.$1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Main {
	static String address = "jdbc:postgresql://127.0.0.1:5432/zajavka";
	static String dbUsername = "postgres";
	static String dbPassword = "postgres";

	static void main() {
		final String query = "SELECT * FROM CUSTOMER WHERE NAME LIKE ?;";
		final String parameter = "%me%";

		try (
				final Connection connection = DriverManager.getConnection(address, dbUsername, dbPassword);
				final PreparedStatement preparedStatement = connection.prepareStatement(query)
		) {
			preparedStatement.setString(1, parameter);
			try (final ResultSet resultSet = preparedStatement.executeQuery()) {
				final List<Customer> customers = CustomerMapper.mapToCustomers(resultSet);
				customers.forEach(customer -> System.out.println("Customer: " + customer));
			}
		} catch (final Exception e) {
			System.out.println("Error while working on database: " + e.getMessage());
		}
	}
}
