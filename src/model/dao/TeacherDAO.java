package model.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.db.DBManager;

import model.vo.Teacher;



public class TeacherDAO {
	 //private DB
	

	public List<Teacher> queryTeacherByName(String inID) throws Exception
	{
		List<Teacher> teList = new ArrayList<Teacher>();
		String sql;
		DBManager db=new DBManager();
		ResultSet rs = null;
		sql = "select id,name,password,age,sex,major,phone from teacher where id = '"+ inID +"'";
		try {
			rs = db.executeQuery(sql);
			while(rs.next())
			{
				Teacher te = new Teacher();
				te.setTeacherid(rs.getString("id"));
				te.setUserName(rs.getString("name"));
				te.setPassword(rs.getString("password"));
				te.setAge(rs.getInt("age"));
				te.setSex(rs.getString("sex"));
				te.setMajor(rs.getString("major"));
				te.setPhone(rs.getString("phone"));
				teList.add(te);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			db.close();
		}
		
		return teList;
	}
	public boolean inertInfo(Teacher te) throws Exception
	{
		String strSql;
		int ret=0;
		 strSql = "insert into student(id,姓名,密码,年龄,性别,职称,联系方式) values('" + 
				te.getTeacherid() + "','" + te.getUserName() + "','"+ 
			       te.getPassword() +"'," + te.getAge() + ",'"+ te.getSex() + "','"+
					te.getPosition() + "','" +te.getPhone() + "')";
		DBManager db = new DBManager();
		try {
			ret = db.executeUpdate(strSql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.close();
		}
		if(ret  > 0)
			return true;
		else
		return false;
		
	}

}
