package view;
import java.util.List;

import model.dao.*;
import model.vo.*;

public class TeacherInfo {

	/**
	 * @param args
	 */
	public void show()
	{
		TeacherDAO td = new TeacherDAO();
		List<Teacher> liTeacher;
		try {
			liTeacher = td.queryTeacherByName("zhang");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
