package FirstServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
	public static int saveEmployee(int id, String name, int sal) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		int status = 0;
		String user = "root";
		String pass = "Aditya@1817";
		String url = "jdbc:mysql://localhost:3306/servlet";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String query = "insert into employee values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, sal);
		int row=ps.executeUpdate();
		if(row>0) {
			status++;
		}
		else {
			System.out.println("Record is not inserted");
		}
		return status;
		
	}
}
