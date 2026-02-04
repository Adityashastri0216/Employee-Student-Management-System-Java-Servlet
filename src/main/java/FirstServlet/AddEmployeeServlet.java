package FirstServlet;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int employee_id = Integer.parseInt(req.getParameter("id"));
		String employee_name = req.getParameter("name");
		int salary = Integer.parseInt(req.getParameter("sal"));
		
		try {
			int status = EmployeeDAO.saveEmployee(employee_id, employee_name, salary);
			if(status>0) {
				System.out.println("record is insert successfully");
				resp.sendRedirect("EAdd.html");
			}
			else {
				System.out.println("record is not inserted");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
