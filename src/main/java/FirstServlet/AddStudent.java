package FirstServlet;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddStudent extends HttpServlet {
	
	ArrayList<Student> s = new ArrayList<Student>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int sid = Integer.parseInt(req.getParameter("sid"));
        String sname = req.getParameter("sname");
        int smarks = Integer.parseInt(req.getParameter("marks"));
        
        s.add(new Student(sid, sname, smarks));
        
        System.out.println(req.getParameter("sid"));
        System.out.println(req.getParameter("sname"));
        System.out.println(req.getParameter("marks"));

        
        
	}
}
