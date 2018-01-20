package view;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import model.dao.AdminDAO;
import model.dao.StudentDAO;
import model.dao.TeacherDAO;
import model.vo.Admin;
import model.vo.Student;
import model.vo.Teacher;

public class LoginCheck {
	private String name;
	private String password;
	private int type =1;

	
public LoginCheck(String ID,String password,int type){
	this.name = ID;
	this.password = password;
	this.type = type;
}


public boolean validate(){
	
	if(type == 1){
//		          //数据库student读取
		
		StudentDAO dao =  new StudentDAO();
		List<Student> stList = new ArrayList<Student>();			
		try {
			stList = dao.queryStudentByName(this.name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0;i<stList.size();i++){
			
			if(this.name.equals(stList.get(i).getStudentid())&&this.password.equals(stList.get(i).getPassword()))
		  {	
			return true;
		  }	


		     }
	}else if(type == 2)
	{
		TeacherDAO dao =  new TeacherDAO();
		List<Teacher> teList = new ArrayList<Teacher>();			
		try {
			teList = dao.queryTeacherByName(this.name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0;i<teList.size();i++){
			
			if(this.name.equals(teList.get(i).getTeacherid())&&this.password.equals(teList.get(i).getPassword()))
		  {	
			return true;
		  }	


		}
		
	}else if(type == 3){
//		               //数据库admin读取

		AdminDAO dao =  new AdminDAO();
		List<Admin> adList = new ArrayList<Admin>();			
		try {
			adList = dao.queryAdminByName(this.name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0;i<adList.size();i++){
			
			if(this.name.equals(adList.get(i).getAdminid())&&this.password.equals(adList.get(i).getPassword()))
		  {	
			return true;
		  }	
		//		JOptionPane.showMessageDialog(null, "用户名或密码错误");  
		}
	}

	JOptionPane.showMessageDialog(null, "用户名或密码错误");  
	return false;
}
}
