package model.dao;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import model.process.CreateExcel1;
import model.process.excelupdate;
import model.vo.Course;
import model.vo.Selectcourse;
import util.db.DBManager;

import model.vo.Course;
import model.vo.Teacher;
import model.vo.Student;

public class StudentDAO{
 
	public List<Student> queryStudentByName(String inID) throws Exception
	{
		List<Student> stList = new ArrayList<Student>();
		String sql;
		DBManager db=new DBManager();
		ResultSet rs = null;
		sql = "select id,name,password,age,sex,class,phone from student where id = '"+ inID +"'";
		try {
			rs = db.executeQuery(sql);
			while(rs.next())
			{
				Student st = new Student();
				st.setStudentid(rs.getString("id"));
				st.setUserName(rs.getString("name"));
				st.setAge(rs.getInt("age"));
				st.setSex(rs.getString("sex"));
				st.setPassword(rs.getString("password"));
				st.setClass1(rs.getString("class"));
				st.setPhone(rs.getString("phone"));
				stList.add(st);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			db.close();
		}
		
		return stList;
	}
	
	
	
	
	
	
	//private JFrame frame=new JFrame("数据显示：");
	//private Container cont =frame.getContentPane();
//	private JList list1=null;
//	private JList list2=null;
//	private JList list3=null;
//	private Student student=null;
//	private JTextArea b=new JTextArea("");
//    private    List<Course> selectedbook=new ArrayList< Course >();
//	private List<Selectcourse> selectbook=new ArrayList<Selectcourse>();
//	public void showselectcourse(int flag ) throws Exception //xuan  ke  and show all course
//	{
//		
//		JFrame frame=new JFrame("数据显示：");
//		
//		Container cont =frame.getContentPane();
//		CourseDAO all=new CourseDAO();
//		List<Course> courses=all.showallcourse();
//		
//		String []a=new String[courses.size()];
//	    
//		
//		 for(int i=0;i<courses.size();i++)
//		 {
//			 
//			 String cinfo=courses.get(i).toString();
//			 a[i]=cinfo;
//				//System.out.println(a[i]);
//		 } // zhi  jie jia dao jlist li mian*/
//		 this.list1=new JList(a);
//		 list1.setBorder(BorderFactory.createTitledBorder("id    couresename  teacherID    state: "));
//		 if(flag==1)
//		 {
//		 list1.addListSelectionListener(this);
//		 }
//		 cont.add(new JScrollPane(this.list1));
//		 frame.setSize(400,250);
//		 
//		 frame.setVisible(true);
//		 frame.addWindowListener(new WindowAdapter()
//		 {
//			 public void windowClosing(WindowEvent arg0)
//			 {
//				 System.exit(1);
//			 }
//		 });
//		 
//		 
//	
//	}
//	
//	public void valueChanged(ListSelectionEvent e) {
//		
//		
//		//System.out.println("xuan ding");
//		
//	//    CreateExcel1 a=new  CreateExcel1();
//	//    a.readexcel();
//	//    excelupdate b=new excelupdate();
//	  // b.updateexcel(bookName, bookid, teacherid, state);
//		if(e.getSource()==list1)
//		{
//			int temp[]=list1.getSelectedIndices();
//		for(int i=0;i<temp.length;i++)
//		{
//			String[] info=list1.getModel().getElementAt(i).toString().split("\\ ");
//		
//		    int cid=Integer.parseInt(info[0]);
//		    int tid=Integer.parseInt(info[2]);
//		    
//		    
//		    
//		    
//		    String strSql;
//			int ret = 0;
//			int flag=0;
//		
//			DBManager db = new DBManager();
//		    strSql = "insert into selectcourse(courseid,teacherid,studentid) values(" + cid + "," + tid + "," + 12 + ")";
//		    
//		 
//			try {
//				ret = db.executeUpdate(strSql);
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			finally
//			{
//				try {
//					db.close();
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			}
//			if(ret  > 0)
//				flag=1;
//			else
//			flag=0;
//		    
//		}
//		}
//		
//		if(e.getSource()==list3)
//		{
//			int temp2[]=list3.getSelectedIndices();
//		System.out.println("delete");
//			
//			for(int i=0;i<temp2.length;i++)
//			{
//				String[] info=list3.getModel().getElementAt(i).toString().split("\\ ");
//			
//			    int cid=Integer.parseInt(info[0]);
//			   // int tid=Integer.parseInt(info[2]);
//			    
//			  System.out.println(cid);
//			    
//			    
//			    String strSql;
//				int ret = 0;
//				int flag=0;
//			System.out.println(cid);
//				DBManager db = new DBManager();
//			    strSql = "DELETE FROM selectcourse where courseid=" + cid;
//			    
//			 
//				try {
//					ret = db.executeUpdate(strSql);
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				finally
//				{
//					try {
//						db.close();
//					} catch (Exception e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				if(ret  > 0)
//					flag=1;
//				else
//				flag=0;
//			    
//			}
//		}
//		    
//
//		
//	}
//	
//    public boolean editmessage(Student student)  //bian ji xin xi
//    
//    {
//    	if(student!=null)
//    	{
//    	Connection conn=null;
//    	Statement stmt=null;
//    	String sql;
//    	sql = "select * from student where Id = "+ student.getStudentid() +"";
//    	 String meaasge="UPATE student set 学生姓名='" + student.getUserName() + "',密码='" 
//    	+ student.getPassword() +"',年龄=" + student.getAge() + ", 性别='" + student.getSex() + "',班级='" 
//    			 + student.getClass1() +"',联系方式='" + student.getPhone() +"',Id=" 
//    	+student.getStudentid(); 
//    	  /* b.setText("注册失败！");
//		   JOptionPane.showMessageDialog(null,b,"注册信息",JOptionPane.INFORMATION_MESSAGE );*/
//    	 return true;
//    	 		
//    	}
//    	else
//    	{
//    		return false;
//    	}
//    			 
//    		
//    	
//    }
//    
//    
//  
//    
//    public void selectedcourse() throws Exception  {// cha kan yi xuan ke cheng
//    	
//         JFrame frame=new JFrame("你已经选择的课程：");
//		
//		Container cont =frame.getContentPane();
//		DBManager db=new DBManager();
//		ResultSet rs = null;
//    	String strSql;
//    	strSql = "select * from selectcourse where studentid = "+ 12 +"";/*student.getStudentid() */
//    	rs = db.executeQuery(strSql);
//        Selectcourse a = new Selectcourse ();
//    	
//		while(rs.next())
//		{
//         
//			
//     			a.setCourseid((rs.getInt("courseid")));
//			
//		       a.setTeacherid((rs.getInt("teacherid")));
//               a.setStudentid((rs.getInt("studentid")));
//     
//		
//			  selectbook.add(a);
//		}
//	
// 
//		String []d=new String[selectbook.size()];
//		for(int i=0;i<selectbook.size();i++)
//		{
//		
//			 
//			 
//			 String strSq2;
//		     strSq2 = "select * from course where id = "+ selectbook.get(i).getCourseid() +"";
//			
//		     
//		     ResultSet rs1 = null;
//		     DBManager db1=new DBManager();
//		     rs1 = db1.executeQuery(strSq2);
//
//		     while(rs1.next())
//				{
//	                   // Course a = new Course();
//		    	 Course c = new Course ();
//	         			c.setId((rs1.getInt("id")));
//	 			
//				   c.setName((rs1.getString("coursename")));
//
//	               c.setTeacherID(rs1.getInt("teacherID"));
//				   c.setState((rs1.getInt("state")));
//				
//					
//				   selectedbook.add(c);
//					
//		
//					
//				}
//		     
//		 
//			
//			for(int j=0;j<selectedbook.size();j++){
//				
//			{
//				d[j]=selectedbook.get(j).toString();
//				
//				
//			}
//		}
//	
//		}
//		this.list2=new JList(d);
//		 list2.setBorder(BorderFactory.createTitledBorder("courseid   teacherid   studentid : "));
//		 cont.add(new JScrollPane(this.list2));
//		 frame.setSize(500,450);
//		 
//		 frame.setVisible(true);
//		 
//		 
//		 frame.addWindowListener(new WindowAdapter()
//		 {
//			 public void windowClosing(WindowEvent arg0)
//			 {
//				 System.exit(1);
//			 }
//		 });
//		 
//    	
//    }
//    
//    
//    
//    public void delectcourse() throws Exception
//    {
//    	   JFrame frame=new JFrame("你已经选择的课程：");
//   		
//   		Container cont =frame.getContentPane();
//   		DBManager db=new DBManager();
//   		ResultSet rs = null;
//       	String strSql;
//       	strSql = "select * from selectcourse where studentid = "+ 12 +"";/*student.getStudentid() */
//       	rs = db.executeQuery(strSql);
//           Selectcourse a = new Selectcourse ();
//       	
//   		while(rs.next())
//   		{
//            
//   			
//        			a.setCourseid((rs.getInt("courseid")));
//   			
//   		       a.setTeacherid((rs.getInt("teacherid")));
//                  a.setStudentid((rs.getInt("studentid")));
//        
//   		
//   			  selectbook.add(a);
//   		}
//   	
//    
//   		String []d=new String[selectbook.size()];
//   		for(int i=0;i<selectbook.size();i++)
//   		{
//   		
//   			 
//   			 
//   			 String strSq2;
//   		     strSq2 = "select * from course where id = "+ selectbook.get(i).getCourseid() +"";
//   			
//   		     
//   		     ResultSet rs1 = null;
//   		     DBManager db1=new DBManager();
//   		     rs1 = db1.executeQuery(strSq2);
//
//   		     while(rs1.next())
//   				{
//   	                   // Course a = new Course();
//   		    	 Course c = new Course ();
//   	         			c.setId((rs1.getInt("id")));
//   	 			
//   				   c.setName((rs1.getString("coursename")));
//
//   	               c.setTeacherID(rs1.getInt("teacherID"));
//   				   c.setState((rs1.getInt("state")));
//   				
//   					
//   				   selectedbook.add(c);
//   					
//   		
//   					
//   				}
//   		     
//   		 
//   			
//   			for(int j=0;j<selectedbook.size();j++){
//   				
//   			{
//   				d[j]=selectedbook.get(j).toString();
//   				
//   				
//   			}
//   		}
//   	
//   		}
//   		this.list3=new JList(d);
//   		this.list3.addListSelectionListener(this);
//   		 list3.setBorder(BorderFactory.createTitledBorder("courseid   teacherid   studentid : "));
//   		 cont.add(new JScrollPane(this.list3));
//   		 frame.setSize(500,450);
//   		 
//   		 frame.setVisible(true);
//   		 
//   		 
//   		 frame.addWindowListener(new WindowAdapter()
//   		 {
//   			 public void windowClosing(WindowEvent arg0)
//   			 {
//   				 System.exit(1);
//   			 }
//   		 });
//		 
//    	
//    	
//    }
//    
//    
//    
//    
//	public boolean inertCourse(Student student)//tian jia xue sheng xin xi
//	{
//		String strSql;
//		int ret = 0;;
//		DBManager db = new DBManager();
//
//     strSql = "insert into student(id,学生姓名,密码,年龄,性别,班级,联系方式) values('" + 
//			student.getStudentid() + "','" + student.getUserName() + "','"+ 
//	       student.getPassword() +"'," + student.getAge() + ",'"+ student.getSex() + "','"+
//			 student.getClass1() +  "','"+ student.getPhone() + "')";
//   
//   
//  
//		try {
//			ret = db.executeUpdate(strSql);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally
//		{
//			try {
//				db.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		if(ret > 0)
//			return true;
//		else
//		return false;
//	}


}
