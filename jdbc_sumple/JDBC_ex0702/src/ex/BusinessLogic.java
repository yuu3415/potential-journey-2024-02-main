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
			
			System.out.println("*** 特定の年齢層の従業員の氏名のリストを取得 ***");
			int minAge=20;
			int maxAge=29;
			
			List<String> name=dao.selectName(minAge, maxAge);
			
			System.out.print(minAge+"歳から"+maxAge+"歳の従業員：");
			
		for (String selectName : name) {
			System.out.print(selectName+" ");
			
		}
			
		} catch (SQLException e) {
			System.out.println("処理結果：異常が発生しました。");
			e.printStackTrace();
		}
	}

}
