package model.vo;

public class Selectcourse {
	private int courseid;
	private int studentid;
	private int teacherid;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String toString()
	{
	  return this.getCourseid()+" "+this.getStudentid()+" "+this.getTeacherid();
	}

}
