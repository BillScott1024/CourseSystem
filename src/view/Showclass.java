package view;

import java.awt.Container;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class Showclass {
	private JFrame frame = new JFrame("课程表");     //窗口名称
	private JLabel infoLab1 = new JLabel("课程表");   //标题
	private Container cont = frame.getContentPane();
	
	private JList<String> list = null;
	
	private JButton regist = new JButton("确           定 ");
	
	public Showclass(){
		Font fnt1 = new Font("Serief", Font.BOLD, 24);
		infoLab1.setFont(fnt1);
		//读数据库，设置查找条件,写入数组
		String nations[] = {"中国","美国","日本","韩国","泰国","英国"};
		this.list = new JList<String>(nations);
		list.setBorder(BorderFactory.createTitledBorder("所有课程："));
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		
		frame.setLayout(null);
		
		infoLab1.setBounds(235, 20, 220, 30);   //大标题
		regist.setBounds(155, 520, 220, 30);
		list.setBounds(30, 50, 500, 450);
		
		frame.add(infoLab1);             //大标题
		frame.add(regist); 
		cont.add(this.list);
		
		this.frame.setBounds(500, 100, 600, 600);
		this.frame.setVisible(true);
	}
}
