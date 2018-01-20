package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;

import model.dao.CourseDAO;
import model.vo.Course;

public class MainFrame2 extends JFrame {
	JMenu jm1,jm2,jm3;
	JMenuBar jmb;
	JMenuItem jmt1,jmt2,jmt3,jmt4,jmt5;
	JTable jtInfo;
	public MainFrame2()
	{    
	//菜单条
	jmb=new JMenuBar();
	
	jm1=new JMenu("教师信息");
	jm2=new JMenu("课程管理");
	jm3 =new JMenu("退出");
	jmb.add(jm1);
	jmb.add(jm2);
	jmb.add(jm3);
	
	jmt1=new JMenuItem("修改个人信息");
	jmt2=new JMenuItem("发布课程");
	jmt3=new JMenuItem("退出系统");
	jmt4=new JMenuItem("查看选课");
	jmt5=new JMenuItem("导出课程表");
	
	
	jm1.add(jmt1);
	jm1.add(jmt4);
	jm1.add(jmt5);
	jm2.add(jmt2);
	jm3.add(jmt3);
	
	jmt1.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		new XiuGaiteacher();
		}

	});
	
	jmt2.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Publish publish = new Publish();
		}

	});
	
	jmt3.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(1);
		
		
		}
	});
	
	jmt4.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			//查看选课情况
			new Te_selectclass();
		}

	});
	
	jmt5.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new Showclass();
			//导出Excel函数
		}

	});
	
	this.add(jmb,"North");
	this.setVisible(true);
	this.setBounds(350, 150, 500, 400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
