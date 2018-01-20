package model.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import model.vo.Course;
import model.vo.Teacher;
import util.db.DBManager;
import model.process.CreateExcel1;
public class CourseDAO{

	private JTableHeader jth;
	private JScrollPane scp;
	private JTable tab;
	private JButton show;
	private JFrame frame= new JFrame("Êý¾ÝÏÔÊ¾");
	private List<Course> savebook=new ArrayList< Course >();
	//savebook = 
	public List<Course> showallcourse() throws Exception// xianshi suoyou kecheng
	{
	

		//String book[]
		//List<Course> savebook=null;
		//savebook=new ArrayList< Course >();
	
		String sql;
		DBManager db=new DBManager();
		ResultSet rs = null;
		sql = "select * from course where state = "+ 1 +"";
		try {
			rs = db.executeQuery(sql);
			while(rs.next())
			{
                    Course a = new Course();
				
         			a.setId((rs.getInt("Id")));
 			
			   a.setName((rs.getString("coursename")));

               a.setTeacherID(rs.getInt("teacherID"));
			   a.setState((rs.getInt("state")));
			
				savebook.add(a);
				
			}
		}catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				db.close();
			}
		
		 return savebook;
	}
	
	
	public boolean inertCourse(Course course)

	{
		String strSql;
		int ret = 0;;
		DBManager db = new DBManager();

      strSql = "insert into course(id,coursename,presentID,state) values(" + 
			course.getId() + ",'" + course.getName() + "',"+ 
	        course.getTeacherID() +"," + course.getState() +")";
   
        
  
		try {
			ret = db.executeUpdate(strSql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				db.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ret > 0)
			return true;
		else
		return false;
	}
}
