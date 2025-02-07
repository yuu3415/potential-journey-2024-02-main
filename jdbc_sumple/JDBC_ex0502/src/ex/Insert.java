package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/sampledb?useSSL=false";
		/* データベースのユーザとパスワード */
		String user = "kcprou";
		String password = "kcprop";

		String sql = "INSERT INTO m_employee (code,name,age,section) VALUES(?,?,?,?)";
		
		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement(sql)){
			
			int num=Integer.parseInt(args[2]);
			
			pstmt.setString(1, args[0]);
			pstmt.setString(2,args[1]);
			pstmt.setInt(3, num);
			pstmt.setString(4,args[3]);
			
			int count=pstmt.executeUpdate();
			
			System.out.println(count+"件のレコードを登録しました");
			
			
	}catch (SQLException e) {
		System.out.println("処理結果：異常が発生しました");
		e.printStackTrace();
	}
}
	}
