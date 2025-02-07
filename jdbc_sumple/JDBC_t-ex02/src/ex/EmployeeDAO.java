package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author AZS azs
 * @version x.x.x 2024/03/05
 */
public class EmployeeDAO {
	public int insert(Employee employee) throws SQLException  {
		int count = 0;

		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con
						.prepareStatement("INSERT INTO m_employee  (code,name,age,section) VALUES(?,?,?,?)")) {

			pstmt.setString(1, employee.getCode());
			pstmt.setString(2, employee.getName());
			pstmt.setInt(3, employee.getAge());
			pstmt.setString(4, employee.getSection());

			count = pstmt.executeUpdate();
	}
		return count;
	}

	public int delete(String code) throws SQLException {
		int count = 0;

		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement("DELETE FROM m_employee WHERE code=?")) {

			pstmt.setString(1, code);

			count = pstmt.executeUpdate();

		} 
		return count;
	}

	public List<Employee> selectAll() throws SQLException {
		List<Employee> employeeList = new ArrayList<Employee>();

		String sql = "SELECT * FROM m_employee";

		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

			ResultSet res = pstmt.executeQuery();

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
