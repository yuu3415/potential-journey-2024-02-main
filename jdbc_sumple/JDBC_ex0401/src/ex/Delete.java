package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
	String url = "jdbc:postgresql://localhost:5432/sampledb?useSSL=false";
	/* データベースのユーザとパスワード */
	String user = "kcprou";
	String password = "kcprop";
	try (Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement()){
				String sql="DELETE FROM m_employee WHERE section='営業部'";
				
				int count=stmt.executeUpdate(sql);
				
				System.out.println("営業部の従業員のレコード "+count+"件を削除しました。");
			}catch (SQLException e) {
				System.out.println("処理結果：異常が発生しました。");
				e.printStackTrace();
			}
}
}