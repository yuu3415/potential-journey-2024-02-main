package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		ConnectionManager dao=new ConnectionManager();
		
		try (Connection con = ConnectionManager.geConnection()){
			System.out.println("sampledbへの接続に成功しました。");
			
		} catch (SQLException e) {
			System.out.println("処理結果：異常が発生しました。");
			e.printStackTrace();
		}
	}

}
