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
	
	private JFrame frame = new JFrame("�����γ�");     //��������
	
	private JLabel infoLab1 = new JLabel("�����γ�");   //����
	


	private JLabel infoLab5 = new JLabel("�����ɹ���");    //��ʾ��

	private JLabel infoLabname = new JLabel("�γ����ƣ�");
	private JLabel infoLabtime = new JLabel("�γ�ѧʱ��");
	private JLabel infoLabyaoqiu = new JLabel("�γ�Ҫ��");
	private JLabel infoLabsex = new JLabel("���˷�ʽ��");
	private JLabel infoLabId = new JLabel("�γ�ID��");
	private JLabel infoLabclass = new JLabel("Ҫ�����ݣ�");

	
	
	private JTextField nameText = new JTextField();
	private JPasswordField timeText = new JPasswordField();
	private JPasswordField yaoqiuText2 = new JPasswordField();
	private JTextField self = new JTextField();
	private JTextField jtclass = new JTextField();
	private JTextField jtid = new JTextField();
	private String boypng = "boy.png";
	private String girlpng = "girl.png";
	private JRadioButton boy = new JRadioButton("����",new ImageIcon(boypng),true);     //��ѡ
	private JRadioButton girl = new JRadioButton("����",new ImageIcon(girlpng),false);
	
//	private JRadioButton boy = new JRadioButton("��");     //��ѡ
//	private JRadioButton girl = new JRadioButton("Ů");

	
	private JButton regist = new JButton("��           ��");
	
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
						infoLab5.setText("ע��ɹ������¼��");


		
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
		infoLabtime.setBounds(50, 104, 200, 20);  //���룺
		infoLabyaoqiu.setBounds(50, 128, 200, 20);   //�����ظ�
		infoLabsex.setBounds(50, 152, 200, 20);
		
		infoLabId.setBounds(50, 56, 200, 20);
		infoLabclass.setBounds(50, 180, 40, 20);
		jtclass.setBounds(120, 180, 150, 20);
		infoLab5.setBounds(10, 530, 220, 30);      //ע��ɹ�!
		

//		infoLab2.setBounds(345, 56, 1000, 20);   //�û�������Ϊ6-16λ��ĸ������
		
//		if (count1 ==1) {

//		}

		nameText.setBounds(115, 80, 200, 20);   //��������
		timeText.setBounds(115, 104, 200, 20);  //��������
		yaoqiuText2.setBounds(115, 128, 200, 20);
		jtid.setBounds(115, 56, 200, 20);
		boy.setBounds(120, 152, 100, 20);
		girl.setBounds(220, 152, 100, 20);
		
		self.setBounds(120, 220, 30, 30);
		
		regist.setBounds(200, 520, 160, 30);
		
		frame.add(infoLab1);             //�����
//		frame.add(infoLab2);        //�û�������Ϊ6-16λ��ĸ������
		


		frame.add(infoLab5);               //ע��ɹ���
		frame.add(infoLabId); 
		frame.add(infoLabclass); 
		frame.add(jtclass);
		frame.add(jtid);
		frame.add(infoLabname);             //����:
		frame.add(infoLabtime);           //����:
		frame.add(infoLabyaoqiu);          //�����ظ�:

		frame.add(infoLabsex);       //�Ա�:
		
		frame.add(nameText);         //���ֿ�
		frame.add(timeText);         //�����
		frame.add(yaoqiuText2);         //�����ظ���
		frame.add(self);            //���˽��ܿ�
		frame.add(regist);         //ע�ᰴť
		frame.add(boy);
		frame.add(girl);
		
		frame.setBounds(500, 100, 600, 600);
		frame.setVisible(true);
		
	}
		

}
