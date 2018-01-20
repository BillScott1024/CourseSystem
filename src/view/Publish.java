package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Publish {
	
	private JFrame frame = new JFrame("发布课程");     //窗口名称
	
	private JLabel infoLab1 = new JLabel("发布课程");   //标题
	


	private JLabel infoLab5 = new JLabel("发布成功！");    //提示四

	private JLabel infoLabname = new JLabel("课程名称：");
	private JLabel infoLabtime = new JLabel("课程学时：");
	private JLabel infoLabyaoqiu = new JLabel("课程要求：");
	private JLabel infoLabsex = new JLabel("考核方式：");
	private JLabel infoLabId = new JLabel("课程ID：");
	private JLabel infoLabclass = new JLabel("要将内容：");

	
	
	private JTextField nameText = new JTextField();
	private JPasswordField timeText = new JPasswordField();
	private JPasswordField yaoqiuText2 = new JPasswordField();
	private JTextField self = new JTextField();
	private JTextField jtclass = new JTextField();
	private JTextField jtid = new JTextField();
	private String boypng = "boy.png";
	private String girlpng = "girl.png";
	private JRadioButton boy = new JRadioButton("考试",new ImageIcon(boypng),true);     //单选
	private JRadioButton girl = new JRadioButton("考查",new ImageIcon(girlpng),false);
	
//	private JRadioButton boy = new JRadioButton("男");     //单选
//	private JRadioButton girl = new JRadioButton("女");

	
	private JButton regist = new JButton("发           布");
	
	int count1  = 0;
	public Publish(){
		
		Font fnt1 = new Font("Serief", Font.BOLD, 24);
		Font fnt2 = new Font("Serief", Font.BOLD, 12);
		infoLab5.setFont(fnt2);
		infoLab1.setFont(fnt1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(boy);
		group.add(girl);
		

		
		regist.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
	
					String tname = nameText.getText();
		//			String tpass = new String(passText.getPassword());
		//			String tpass2 = new String(passText2.getPassword());


						String strself = self.getText();
	//					UpdateExcel updateExcel= new UpdateExcel();
	//					updateExcel.updateself(strself);
						infoLab5.setText("注册成功，请登录！");


		
			}
		});
		
		
		
		boy.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sex = "男";
	//			UpdateExcel updateExcel= new UpdateExcel();
	//			updateExcel.updateexcel(sex);
			}
			});
		girl.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sex = "女";
	//			UpdateExcel updateExcel= new UpdateExcel();
	//			updateExcel.updateexcel(sex);
			}
			});
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
			//	System.exit(1);
			}
		});
		
		frame.setLayout(null);
		
		infoLab1.setBounds(235, 20, 220, 30);   //大标题
		
		infoLabname.setBounds(50, 80, 200, 20);   //用户名：
		infoLabtime.setBounds(50, 104, 200, 20);  //密码：
		infoLabyaoqiu.setBounds(50, 128, 200, 20);   //密码重复
		infoLabsex.setBounds(50, 152, 200, 20);
		
		infoLabId.setBounds(50, 56, 200, 20);
		infoLabclass.setBounds(50, 180, 40, 20);
		jtclass.setBounds(120, 180, 150, 20);
		infoLab5.setBounds(10, 530, 220, 30);      //注册成功!
		

//		infoLab2.setBounds(345, 56, 1000, 20);   //用户名必须为6-16位字母或数字
		
//		if (count1 ==1) {

//		}

		nameText.setBounds(115, 80, 200, 20);   //名字输入
		timeText.setBounds(115, 104, 200, 20);  //密码输入
		yaoqiuText2.setBounds(115, 128, 200, 20);
		jtid.setBounds(115, 56, 200, 20);
		boy.setBounds(120, 152, 100, 20);
		girl.setBounds(220, 152, 100, 20);
		
		self.setBounds(120, 220, 30, 30);
		
		regist.setBounds(200, 520, 160, 30);
		
		frame.add(infoLab1);             //大标题
//		frame.add(infoLab2);        //用户名必须为6-16位字母或数字
		


		frame.add(infoLab5);               //注册成功！
		frame.add(infoLabId); 
		frame.add(infoLabclass); 
		frame.add(jtclass);
		frame.add(jtid);
		frame.add(infoLabname);             //姓名:
		frame.add(infoLabtime);           //密码:
		frame.add(infoLabyaoqiu);          //密码重复:

		frame.add(infoLabsex);       //性别:
		
		frame.add(nameText);         //名字框
		frame.add(timeText);         //密码框
		frame.add(yaoqiuText2);         //密码重复框
		frame.add(self);            //个人介绍框
		frame.add(regist);         //注册按钮
		frame.add(boy);
		frame.add(girl);
		
		frame.setBounds(500, 100, 600, 600);
		frame.setVisible(true);
		
	}
		

}
