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

	public List<String> selectName(int minAge, int maxAge)throws SQLException {
		
		List<String> name = new ArrayList<String>();

		try (Connection con = ConnectionManager.geConnection();
				PreparedStatement pstmt = con.prepareStatement("SELECT name FROM m_employee WHERE age>=? AND age<=?")) {
			
			pstmt.setInt(1, minAge);
			pstmt.setInt(2, maxAge);
			
			ResultSet res =pstmt.executeQuery();
			
		
			
			while (res.next()) {
				name.add(res.getString("name"));
			}
			
		}

		return name;

	}

}
