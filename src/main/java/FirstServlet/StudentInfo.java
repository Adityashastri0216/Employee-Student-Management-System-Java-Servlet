package FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentInfo extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int id = Integer.parseInt(req.getParameter("id"));
		int marks = Integer.parseInt(req.getParameter("marks"));
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(marks);
	}
}
