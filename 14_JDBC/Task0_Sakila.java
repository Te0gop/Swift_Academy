package homework;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Task0_Sakila {
	public static void main(String[] args) throws SQLException {
		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/sakila", "root", "123456789");
				CallableStatement statement = conn.prepareCall( "{call insert_country(?, ?)}")) {
				statement.setString("new_country", "Bulgaria");
				statement.registerOutParameter("new_id", Types.INTEGER);
				statement.execute();
				Integer newId = statement.getInt("new_id");
				System.out.println(newId);
				}
	}

}
