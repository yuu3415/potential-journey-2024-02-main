package ex;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 * @author AZS azs
 * @version x.x.x 2024/03/04
 */
public class BusinessLogic {
	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAO();
		
		try {
			
			System.out.println("*** 特定の従業員の部署を変更する ***");
			String section="総務部";
			String code="201042";
			
			int count=dao.updateSection(code, section);
			
			System.out.println(count + "件のレコードが更新されました。");
			
		} catch (SQLException e) {
			System.out.println("処理結果：異常が発生しました。");
			e.printStackTrace();
		}
	}

}
