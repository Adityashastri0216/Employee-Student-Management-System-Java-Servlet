package Student;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int student_id = Integer.parseInt(req.getParameter("id"));
		String student_name =  req.getParameter("name");
		int marks = Integer.parseInt(req.getParameter("marks"));
		int age = Integer.parseInt(req.getParameter("age"));
		
		try {
			int status = StudentDAO.saveStudent(student_id, student_name, marks, age);
			if(status>0) {
				System.out.println("Student Created Successfully");
				resp.sendRedirect("CStudent.html");
			}
			else {
				System.out.println("record is not inserted");
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
