package FirstServlet;

public class Student {
	int sid;
	String sname;
	int smarks;
	
	public Student(int sid, String sname,int smarks) {
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSmarks() {
		return smarks;
	}

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	
}
