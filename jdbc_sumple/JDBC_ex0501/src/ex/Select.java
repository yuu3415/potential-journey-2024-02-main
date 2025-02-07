package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/sampledb?useSSL=false";
		/* データベースのユーザとパスワード */
		String user = "kcprou";
		String password = "kcprop";

		String sql = "SELECT * FROM m_employee WHERE age>=?";

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			int num = Integer.parseInt(args[0]);

			pstmt.setInt(1, num);

			ResultSet res = pstmt.executeQuery();

			while (res.next()) {
				System.out.println(res.getString("code") + "\t|" + res.getString("name") + "\t|" + res.getString("age")
						+ "\t|" + res.getString("section"));
			}
		} catch (SQLException e) {
			System.out.println("処理結果：異常が発生しました。");
			e.printStackTrace();
		}
	}
}
