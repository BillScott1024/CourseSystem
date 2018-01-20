package model.vo;

public class Course {
	private int id;
	private String name;
	private int teacherID;
	//private String courseRe;
	//private int teacherId;
	private int state;
/*	public Course(int id,String name,int teacherID, int state)
	{
		
		
		this.id=id;
		this.name = name;
		this.teacherID = teacherID;
		this.state = state;
	}*/
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	

	public int getState() {
		return state;
	}
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	public String toString()
	{
		return this.getId()+" "+this.getName()+" "+this.getTeacherID()+" "+this.getState();
	}

}
