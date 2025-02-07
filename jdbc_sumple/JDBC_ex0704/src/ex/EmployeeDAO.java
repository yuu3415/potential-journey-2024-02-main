package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author AZS azs
 * @version x.x.x 2024/03/04
 */
public class EmployeeDAO {

	public List<Employee> select (int maxAge)throws SQLException {
		
		List<Employee> employeeList=new ArrayList<Employee>();
		
		
		String sql="SELECT * FROM m_employee WHERE age<=?";
		
	

		try (Connection con = ConnectionManager.geConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, maxAge);
			
			ResultSet res =pstmt.executeQuery();
			
			while (res.next()) {
				String code = res.getString("code");
				String name = res.getString("name");
				int age = res.getInt("age");
				String section = res.getString("section");
				Employee employee = new Employee();
				employee.setCode(code);
				employee.setName(name);
				employee.setAge(age);
				employee.setSection(section);
				employeeList.add(employee);
			}
		}

		return employeeList;

	}

}
