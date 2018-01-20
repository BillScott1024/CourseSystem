package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login {
	private JFrame frame = new JFrame("欢迎登录");
	private JButton submit = new JButton("登录");
	private JButton reset = new JButton("注册");
	private JLabel nameLab = new JLabel("用户名：");
	private JLabel passLab = new JLabel("密    码：");
	private JLabel infoLab1 = new JLabel("用户登录");
	private JLabel infoLab2 = new JLabel("用户登录");
	private JTextField nameText = new JTextField();
	private JPasswordField passText = new JPasswordField();
	
	private JRadioButton jrstudent = new JRadioButton("学生");
	private JRadioButton jrteacher = new JRadioButton("教师");
	private JRadioButton jradmin = new JRadioButton("管理员");
	
	private  int type = 1;
	
	
	public Login(){
		ButtonGroup group = new ButtonGroup();
		group.add(jrstudent);
		group.add(jrteacher);
		group.add(jradmin);
		
		Font fnt1 = new Font("Serief", Font.BOLD, 24);
		Font fnt2 = new Font("Serief", Font.BOLD, 12);
		infoLab2.setFont(fnt2);
		infoLab1.setFont(fnt1);

		jrstudent.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				type =1;
			}
			});
		
		jrteacher.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				type =2;
			}
			});
		
		jradmin.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				type =3;
			}
			});
		
		submit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
					String tID =nameText.getText();
					String tpass = new String(passText.getPassword());

					LoginCheck log = new LoginCheck(tID,tpass,type);
					if(log.validate()){
						
						if (type==1) {
							new MainFrame();
							infoLab2.setText("登陆成功，欢迎同学！");
						}else if (type==2) {
							new MainFrame2();
							infoLab2.setText("登陆成功，欢迎老师！");
						}else if (type==3) {
							new MainFrame3();
							infoLab2.setText("登陆成功，欢迎管理员！");
						}
						
					}else {
						infoLab2.setText("登录失败，请检查用户名和密码！");
					}

		
			}
		});
		
		reset.addActionListener(new ActionListener(){      //注册
			@Override
			public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == reset){
				
				if (type == 1) {
					ZhuCestudent zhuCe = new ZhuCestudent();
					infoLab2.setText("用户注册！");
				}else if (type == 2) {
					ZhuCeteacher zhuCe = new ZhuCeteacher();
					infoLab2.setText("用户注册！");
				}else if (type == 3) {
					ZhuCeadmin zhuCe = new ZhuCeadmin();
					infoLab2.setText("用户注册！");
				}
				
//				File file=new File("info.xls");    
//				if(!file.exists())    
//				{      
				//读数据库
				
//				}
				
			}
			}
		});
		
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
		
		frame.setLayout(null);
		
		nameLab.setBounds(55, 56, 60, 20);      //名字提示
		passLab.setBounds(55, 80, 60, 20);      //密码提示
		
		infoLab1.setBounds(65, 5, 220, 30);   //标题
		
		infoLab2.setBounds(5, 135, 220, 30);   //提示信息
		
		nameText.setBounds(115, 56, 100, 20);   //名字输入
		passText.setBounds(115, 80, 100, 20);  //密码输入
		
		submit.setBounds(55, 116, 60, 20);    //登录
		reset.setBounds(155, 116, 60, 20);     //注册
		
		
		jrstudent.setBounds(215, 55, 60, 30);
		jrteacher.setBounds(275, 55, 60, 30);
		jradmin.setBounds(335, 55, 70, 30);
		
		frame.add(jrstudent);
		frame.add(jrteacher);
		frame.add(jradmin);
		
		frame.add(nameLab);
		frame.add(passLab);
		
		frame.add(infoLab1);
		frame.add(infoLab2);
		
		frame.add(nameText);
		frame.add(passText);
		frame.add(submit);
		frame.add(reset);
		
		frame.setBounds(400, 250, 420, 200);
		frame.setVisible(true);
		
	}
}
