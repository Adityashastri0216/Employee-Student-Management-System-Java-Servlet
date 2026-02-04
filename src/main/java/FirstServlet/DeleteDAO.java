package FirstServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDAO {
	public static int delteEmployee(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user = "root";
		String pass = "Aditya@1817";
		String url = "jdbc:mysql://localhost:3306/servlet";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String query = "delete from employee where id=?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
        int result = ps.executeUpdate();
        con.close();
		return result;
		
	}
}
