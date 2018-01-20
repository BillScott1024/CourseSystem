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
	private JFrame frame = new JFrame("��ӭ��¼");
	private JButton submit = new JButton("��¼");
	private JButton reset = new JButton("ע��");
	private JLabel nameLab = new JLabel("�û�����");
	private JLabel passLab = new JLabel("��    �룺");
	private JLabel infoLab1 = new JLabel("�û���¼");
	private JLabel infoLab2 = new JLabel("�û���¼");
	private JTextField nameText = new JTextField();
	private JPasswordField passText = new JPasswordField();
	
	private JRadioButton jrstudent = new JRadioButton("ѧ��");
	private JRadioButton jrteacher = new JRadioButton("��ʦ");
	private JRadioButton jradmin = new JRadioButton("����Ա");
	
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
							infoLab2.setText("��½�ɹ�����ӭͬѧ��");
						}else if (type==2) {
							new MainFrame2();
							infoLab2.setText("��½�ɹ�����ӭ��ʦ��");
						}else if (type==3) {
							new MainFrame3();
							infoLab2.setText("��½�ɹ�����ӭ����Ա��");
						}
						
					}else {
						infoLab2.setText("��¼ʧ�ܣ������û��������룡");
					}

		
			}
		});
		
		reset.addActionListener(new ActionListener(){      //ע��
			@Override
			public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == reset){
				
				if (type == 1) {
					ZhuCestudent zhuCe = new ZhuCestudent();
					infoLab2.setText("�û�ע�ᣡ");
				}else if (type == 2) {
					ZhuCeteacher zhuCe = new ZhuCeteacher();
					infoLab2.setText("�û�ע�ᣡ");
				}else if (type == 3) {
					ZhuCeadmin zhuCe = new ZhuCeadmin();
					infoLab2.setText("�û�ע�ᣡ");
				}
				
//				File file=new File("info.xls");    
//				if(!file.exists())    
//				{      
				//�����ݿ�
				
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
		
		nameLab.setBounds(55, 56, 60, 20);      //������ʾ
		passLab.setBounds(55, 80, 60, 20);      //������ʾ
		
		infoLab1.setBounds(65, 5, 220, 30);   //����
		
		infoLab2.setBounds(5, 135, 220, 30);   //��ʾ��Ϣ
		
		nameText.setBounds(115, 56, 100, 20);   //��������
		passText.setBounds(115, 80, 100, 20);  //��������
		
		submit.setBounds(55, 116, 60, 20);    //��¼
		reset.setBounds(155, 116, 60, 20);     //ע��
		
		
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
