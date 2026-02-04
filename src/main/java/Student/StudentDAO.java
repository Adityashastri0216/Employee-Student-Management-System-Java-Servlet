package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
	public static int saveStudent(int id, String name, int marks, int age) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		int status = 0;
		String user = "root";
		String pass = "Aditya@1817";
		String url = "jdbc:mysql://localhost:3306/StudentServlet";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String query = "insert into student values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, marks);
		ps.setInt(4, age);
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
