package in.nivethitha.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		String driverClass = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost/atmusers_db";
		String userName = "postgres";
		String password = "postgres";

		Class.forName(driverClass);

		Connection connection = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Created");
		return connection;

	}

	/**
	 * This method is used to close the connection of Resultset connection and
	 * prepared statement Method overloading
	 * 
	 * @param con
	 */
	public static void close(ResultSet rs, Statement statement, Connection con) {
		try {

			if (rs != null) {
				rs.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method closes the connections for statement and connection.
	 * 
	 * @param statement
	 * @param con
	 */
	public static void close(Statement statement, Connection con) {
		try {
			if (statement != null) {
				statement.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
