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

	public int updateSection(String code, String section)throws SQLException {
		
		
		String sql="UPDATE m_employee SET section=? WHERE code=?";
		
		int count=0;

		try (Connection con = ConnectionManager.geConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, section);
			pstmt.setString(2, code);
			
			count=pstmt.executeUpdate();
		}

		return count;

	}

}
