package Student;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateStudentServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
        int marks = Integer.parseInt(req.getParameter("marks"));
        
        try {
			int result = UpdateStudentDAO.updateStudent(id, marks);
			if(result > 0) {
				resp.sendRedirect("UStudent.html");
            } else {	 
            	System.out.println("<h2>Student Not Found</h2>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
