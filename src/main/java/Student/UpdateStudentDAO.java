package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudentDAO {
	public static int updateStudent(int id, int marks) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		int status = 0;
		String user = "root";
		String pass = "Aditya@1817";
		String url = "jdbc:mysql://localhost:3306/StudentServlet";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String query = "update student set marks=? where id=?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, marks);
        ps.setInt(2, id);
        int result = ps.executeUpdate();
        con.close();

        return result;
		}
}
