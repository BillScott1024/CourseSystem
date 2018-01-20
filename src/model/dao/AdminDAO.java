package model.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.vo.Admin;
import model.vo.Student;
import util.db.DBManager;

public class AdminDAO {
	
	

	
	
	public List<Admin> queryAdminByName(String inID) throws Exception
	{
		List<Admin> adList = new ArrayList<Admin>();
		String sql;
		DBManager db=new DBManager();
		ResultSet rs = null;
		sql = "select id,name,password,age,sex,phone from admin where id = '"+ inID +"'";
		try {
			rs = db.executeQuery(sql);
			while(rs.next())
			{
				Admin ad = new Admin();
				ad.setAdminid(rs.getString("id"));
				ad.setUserName(rs.getString("name"));
				ad.setAge(rs.getInt("age"));
				ad.setSex(rs.getString("sex"));
				ad.setPassword(rs.getString("password"));

				ad.setPhone(rs.getString("phone"));
				adList.add(ad);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			db.close();
		}
		
		return adList;
	}
	public boolean inertAdmin(Admin admin)
	{
		String strSql;
		int ret = 0;;
		DBManager db = new DBManager();

      strSql = "insert into student(id,学生姓名,密码,年龄,性别,联系方式) values('" + 
			admin.getAdminid() + "','" + admin.getPassword() + "',"+ 
	       admin.getAge() +",'" + admin.getSex() + "','"+ admin.getPhone() + "')";
   
   
  
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
