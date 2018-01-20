package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.loading.PrivateClassLoader;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import model.process.ExportExcel;

public class Te_selectclass {
	private JFrame frame = new JFrame("课程表");     //窗口名称
	private JLabel infoLab1 = new JLabel("课程表");   //标题
	private Container cont = frame.getContentPane();
	private JTextField jtcourse = new JTextField();
	
	private JList<String> list = null;
	private JButton submit = new JButton("确认");
	private JButton regist = new JButton("导           出 ");
	private int jcourse = 0;
	public Te_selectclass(){
		Font fnt1 = new Font("Serief", Font.BOLD, 24);
		infoLab1.setFont(fnt1);
		//读数据库，设置查找条件,写入数组
		String nations[] = {"中国","美国","日本","韩国","泰国","英国"};
		this.list = new JList<String>(nations);
		list.setBorder(BorderFactory.createTitledBorder("所有学生："));
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		
		frame.setLayout(null);
		
		infoLab1.setBounds(235, 20, 220, 30);   //大标题
		regist.setBounds(155, 520, 220, 30);
		list.setBounds(30, 100, 500, 370);
		
		submit.setBounds(440, 60, 60, 30);
		
		jtcourse.setBounds(350, 60, 80, 30);
		
		frame.add(infoLab1);             //大标题
		frame.add(regist);
		frame.add(submit);
		
		frame.add(jtcourse);
		cont.add(this.list);
		
		this.frame.setBounds(500, 100, 600, 600);
		this.frame.setVisible(true);
		
		
		
		
		
		submit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//确认选课
				
				jcourse =Integer.parseInt(jtcourse.getText());
				
			}
		});
		
		regist.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//导出excel
				ExportExcel exportstudent= new ExportExcel();
				try {
					exportstudent.exportStudent(jcourse);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
}
