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
	private JFrame frame = new JFrame("�γ̱�");     //��������
	private JLabel infoLab1 = new JLabel("�γ̱�");   //����
	private Container cont = frame.getContentPane();
	
	private JList<String> list = null;
	
	private JButton regist = new JButton("ȷ           �� ");
	
	public Showclass(){
		Font fnt1 = new Font("Serief", Font.BOLD, 24);
		infoLab1.setFont(fnt1);
		//�����ݿ⣬���ò�������,д������
		String nations[] = {"�й�","����","�ձ�","����","̩��","Ӣ��"};
		this.list = new JList<String>(nations);
		list.setBorder(BorderFactory.createTitledBorder("���пγ̣�"));
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		
		frame.setLayout(null);
		
		infoLab1.setBounds(235, 20, 220, 30);   //�����
		regist.setBounds(155, 520, 220, 30);
		list.setBounds(30, 50, 500, 450);
		
		frame.add(infoLab1);             //�����
		frame.add(regist); 
		cont.add(this.list);
		
		this.frame.setBounds(500, 100, 600, 600);
		this.frame.setVisible(true);
	}
}
