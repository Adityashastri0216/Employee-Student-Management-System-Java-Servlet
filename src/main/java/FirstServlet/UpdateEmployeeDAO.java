package FirstServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployeeDAO {
	public static int updateEmployee(int id, int sal) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		int status = 0;
		String user = "root";
		String pass = "Aditya@1817";
		String url = "jdbc:mysql://localhost:3306/servlet";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String query = "update employee set sal=? where id=?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, sal);
        ps.setInt(2, id);
        int result = ps.executeUpdate();
        con.close();

        return result;
		}
	}
