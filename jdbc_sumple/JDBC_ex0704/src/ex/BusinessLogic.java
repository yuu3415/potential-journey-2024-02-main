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
			
			System.out.println("*** 30歳以下の従業員情報を表示 ***");
			int maxAge = 30;
			
			List<Employee> employeeList=dao.select(maxAge);
			
			for (Employee tempEmp : employeeList) {
				String code = tempEmp.getCode();
				String name = tempEmp.getName();
				int age = tempEmp.getAge();
				String section = tempEmp.getSection();
				System.out.print(code + "\t| ");
				System.out.print(name + "  \t| ");
				System.out.print(age +"\t| ");
				System.out.print(section + "\n");
				}
			
		} catch (SQLException e) {
			System.out.println("処理結果：異常が発生しました。");
			e.printStackTrace();
		}
	}

}
