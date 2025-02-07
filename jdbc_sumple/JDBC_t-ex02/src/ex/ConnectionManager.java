package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private final static String url = "jdbc:postgresql://localhost:5432/sampledb?useSSL=false";
	/* データベースのユーザとパスワード */
	private final static String user = "kcprou";
	private final static String password = "kcprop";

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(url, user, password);

	}

}
