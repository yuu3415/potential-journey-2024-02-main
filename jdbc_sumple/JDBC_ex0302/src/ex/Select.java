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
				ResultSet res = stmt.executeQuery("SELECT * FROM m_employee WHERE section='開発部'")) {
			// ResultSetの操作
			int index=1;
			
			while (res.next()) {
				System.out.print(index+":"+res.getString("code")+"\t|");
				System.out.print(res.getString("name")+"\t|");
				System.out.print(res.getString("age")+"\n");
				
				index++;
			}
		} catch (SQLException e) {
			System.out.println("処理結果：異常が発生しました。");
			e.printStackTrace();
		}
	}

}
