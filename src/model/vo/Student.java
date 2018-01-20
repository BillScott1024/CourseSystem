package model.vo;

public class Student {

	private String studentid;
	private String userName;
	private String password;
	private int age;
	
	private String sex;
	private String major;
	private String class1;
	//private String TeacherName;
	private String course;
	//private String eMail;
	private String phone;
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getClass1() {
		return class1;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}
	/*public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}*/
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString()
	{
		return this.getStudentid()+" "+this.getUserName()+" "+this.getPassword()+" "+this.getAge()+" "+this.getSex()+" "+this.getClass1()+" "+this.getPhone();
	}
	
	
}
