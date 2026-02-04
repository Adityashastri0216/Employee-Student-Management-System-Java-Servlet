package FirstServlet;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		try {
			int result = DeleteDAO.delteEmployee(id);
			
			if(result > 0) {
				resp.sendRedirect("EDelet.html");
			}
			else {
				System.out.println("<h2>Employee Not Found</h2>");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
        	e.printStackTrace();     
        	}
	}
}
