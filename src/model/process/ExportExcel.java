package model.process;
import java.util.List;

import model.dao.SelectDAO;
import model.vo.*;
public class ExportExcel {
	public List<Student> exportStudent(int inCourse)
	{
		
		SelectDAO sdao = new SelectDAO();
		sdao.queryCourseByName(inCourse);
		return null;
		
	}

}
