package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author AZS azs
 * @version x.x.x 2024/03/05
 */
public class SelectEmployee {
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

			int count = 0;

			while (res.next()) {
				System.out.println("code:" + res.getString("code") + " name" + res.getString("name") + " age"
						+ res.getString("age") + " section" + res.getString("section"));
				count++; // データ数を取ろうと試行錯誤してしまったでこの処理の方法を覚えて置く。
			}
			System.out.println("年齢が" + num + "歳以上の従業員は、" + count + "名です。");

		} catch (SQLException e) {
			System.out.println("処理結果：異常が発生しました。");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("不正な引数：コマンドライン引数で年齢をしてください。");
		} catch (NumberFormatException e) {
			System.out.println("不正な引数：年齢は整数値で指定してください。");
		}

	}

}
