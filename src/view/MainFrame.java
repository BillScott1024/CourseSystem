package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;


public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenu jm1,jm2,jm3;
	JMenuBar jmb;
	JMenuItem jmt1,jmt2,jmt3,jmt4,jmt5,jmt6;
	JTable jtInfo;
	public MainFrame()
	{    
	//�˵���
	jmb=new JMenuBar();
	
	jm1=new JMenu("ѧ����Ϣ");
	jm2=new JMenu("ѡ��");
	jm3 =new JMenu("�˳�");
	jmb.add(jm1);
	jmb.add(jm2);
	jmb.add(jm3);
	
	jmt1=new JMenuItem("�޸ĸ�����Ϣ");
	jmt2=new JMenuItem("����ѡ��");
	jmt3=new JMenuItem("�˳�ϵͳ");
	jmt4 = new JMenuItem("��ʾ���пγ�");
	jmt5 = new JMenuItem("�鿴��ѡ�γ�");
	jmt6 = new JMenuItem("�����γ̱�");
	
	jm1.add(jmt1);
	jm1.add(jmt4);
	jm1.add(jmt5);
	jm1.add(jmt6);
	
	jm2.add(jmt2);
	jm3.add(jmt3);
	
	jmt1.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			//�޸ĸ�����Ϣ
		new XiuGaistudent();

		}

	});
	
	jmt2.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		new Selectclass();
		//ѡ��
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
		new Showclass();
			//�鿴���пγ�
		}

	});
	
	jmt5.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new Showclass();
			//�鿴��ѡ�γ�
			
		}

	});
	
	jmt6.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new Showclass();
		//�����γ̱���
		}

	});
	
	
	this.add(jmb,"North");
	this.setVisible(true);
	this.setBounds(350, 150, 500, 400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
