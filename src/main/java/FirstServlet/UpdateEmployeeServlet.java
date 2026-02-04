package FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateEmployeeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        int sal = Integer.parseInt(req.getParameter("sal"));

        try {
            int result = UpdateEmployeeDAO.updateEmployee(id, sal);

            if (result > 0) {
                resp.sendRedirect("UEmp.html");
            } else {
            	 
            	System.out.println("<h2>Employee Not Found</h2>");
            }

        } catch(ClassNotFoundException e) {
        	e.printStackTrace();
        } catch(SQLException e) {
        	e.printStackTrace();        }
        
    }
}
