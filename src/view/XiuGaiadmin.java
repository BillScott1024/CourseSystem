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

public class XiuGaiadmin {
private JFrame frame = new JFrame("������Ϣ");     //��������
	
	private JLabel infoLab1 = new JLabel("����Ա��Ϣ�޸�");   //����
	
//	private JLabel infoLab2 = new JLabel("�û�������Ϊ6-16λ��ĸ������");    //��ʾһ
	private JLabel infoLab3 = new JLabel("���벻��Ϊ��");    //��ʾ��
	private JLabel infoLab4 = new JLabel("�����������һ��");    //��ʾ��
	private JLabel infoLab5 = new JLabel("�޸ĳɹ���");    //��ʾ��

	private JLabel infoLabname = new JLabel("�û�����");
	private JLabel infoLabpass = new JLabel("��    �룺");
	private JLabel infoLabpass2 = new JLabel("�����ظ���");
	private JLabel infoLabsex = new JLabel("��    ��");
	private JLabel infoLabId = new JLabel("����������");


	private JLabel infoLabage = new JLabel("����:");
	private JLabel infoLabQQ = new JLabel("QQ:");
	private JTextField jtQQ = new JTextField();
	
	private JTextField nameText = new JTextField();
	private JPasswordField passText = new JPasswordField();
	private JPasswordField passText2 = new JPasswordField();
	private JTextField self = new JTextField();
	private JTextField jtclass = new JTextField();
	private JTextField jtid = new JTextField();
	private String boypng = "boy.png";
	private String girlpng = "girl.png";
	private JRadioButton boy = new JRadioButton("��",new ImageIcon(boypng),true);     //��ѡ
	private JRadioButton girl = new JRadioButton("Ů",new ImageIcon(girlpng),false);
	
//	private JRadioButton boy = new JRadioButton("��");     //��ѡ
//	private JRadioButton girl = new JRadioButton("Ů");

	
	private JButton regist = new JButton("ע           ��");
	
	int count1  = 0;
	public XiuGaiadmin(){
		
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
					String tpass = new String(passText.getPassword());
					String tpass2 = new String(passText2.getPassword());


						String strself = self.getText();
	//					UpdateExcel updateExcel= new UpdateExcel();
	//					updateExcel.updateself(strself);
						infoLab5.setText("�޸ĳɹ���");


		
			}
		});
		
		
		
		boy.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sex = "��";
	//			UpdateExcel updateExcel= new UpdateExcel();
	//			updateExcel.updateexcel(sex);
			}
			});
		girl.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sex = "Ů";
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
		
		infoLab1.setBounds(235, 20, 220, 30);   //�����
		
		infoLabname.setBounds(50, 80, 200, 20);   //�û�����
		infoLabpass.setBounds(50, 104, 200, 20);  //���룺
		infoLabpass2.setBounds(50, 128, 200, 20);   //�����ظ�
		infoLabsex.setBounds(50, 152, 200, 20);
		infoLabage.setBounds(50, 220, 200, 20);
		
		infoLabId.setBounds(50, 56, 200, 20);

		jtclass.setBounds(120, 180, 150, 20);
		
		infoLabQQ.setBounds(50, 260, 30, 30);
		infoLab5.setBounds(10, 530, 220, 30);      //ע��ɹ�!
		
		infoLab3.setBounds(345, 80, 1000, 20);
//		infoLab2.setBounds(345, 56, 1000, 20);   //�û�������Ϊ6-16λ��ĸ������
		
//		if (count1 ==1) {
			infoLab4.setBounds(345, 104, 1000, 20);
//		}
		infoLab4.setBounds(345, 104, 1000, 20);
		nameText.setBounds(115, 80, 200, 20);   //��������
		passText.setBounds(115, 104, 200, 20);  //��������
		passText2.setBounds(115, 128, 200, 20);
		jtid.setBounds(115, 56, 200, 20);
		boy.setBounds(120, 152, 100, 20);
		girl.setBounds(220, 152, 100, 20);
		
		self.setBounds(120, 220, 30, 30);
		jtQQ.setBounds(120, 260, 200, 30);
		regist.setBounds(200, 520, 160, 30);
		
		frame.add(infoLab1);             //�����
//		frame.add(infoLab2);        //�û�������Ϊ6-16λ��ĸ������
		
		frame.add(infoLab3);           //���벻��Ϊ��
		frame.add(infoLab4);             //�����������һ��
		frame.add(infoLab5);               //ע��ɹ���
		frame.add(infoLabId); 

		frame.add(jtclass);
		frame.add(jtid);
		frame.add(infoLabname);             //����:
		frame.add(infoLabpass);           //����:
		frame.add(infoLabpass2);          //�����ظ�:

		frame.add(infoLabsex);       //�Ա�:
		frame.add(infoLabage);      //����:
		frame.add(infoLabQQ);  
		frame.add(jtQQ); 
		
		frame.add(nameText);         //���ֿ�
		frame.add(passText);         //�����
		frame.add(passText2);         //�����ظ���
		frame.add(self);            //���˽��ܿ�
		frame.add(regist);         //ע�ᰴť
		frame.add(boy);
		frame.add(girl);
		
		frame.setBounds(500, 100, 600, 600);
		frame.setVisible(true);
		
	}
}