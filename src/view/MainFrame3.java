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

public class MainFrame3 extends JFrame {
	JMenu jm1,jm2,jm3;
	JMenuBar jmb;
	JMenuItem jmt1,jmt2,jmt3;
	JTable jtInfo;
	public MainFrame3()
	{    
	//�˵���
	jmb=new JMenuBar();
	
	jm1=new JMenu("����Ա��Ϣ");
	jm2=new JMenu("���");
	jm3 =new JMenu("�˳�");
	jmb.add(jm1);
	jmb.add(jm2);
	jmb.add(jm3);
	
	jmt1=new JMenuItem("�޸ĸ�����Ϣ");
	jmt2=new JMenuItem("��˿γ�");
	jmt3=new JMenuItem("�˳�");
	
	
	jm1.add(jmt1);
	jm2.add(jmt2);
	jm3.add(jmt3);
	
	jmt1.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		new XiuGaiadmin();
		
		}

	});
	
	jmt2.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		Review review = new Review();
		
		}
	});
	
	jmt3.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		System.exit(1);
		}

	});
	this.add(jmb,"North");
	this.setVisible(true);
	//this.setSize(400, 300);
	this.setBounds(350, 150, 500, 400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
