package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/sampledb?useSSL=false";
		/* データベースのユーザとパスワード */
		String user = "kcprou";
		String password = "kcprop";
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery("SELECT * FROM m_employee")) {
			// ResultSetの操作
			while (res.next()) {
				System.out.print(res.getString("name") + " ("+res.getString("age")+")"+"\n");
			}
		} catch (SQLException e) {
			System.out.println("処理結果：異常が発生しました。");
			e.printStackTrace();
		}
	}

}
