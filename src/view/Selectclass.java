package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Selectclass implements ListSelectionListener{
	private JFrame frame = new JFrame("�γ̱�");     //��������
	private JLabel infoLab1 = new JLabel("�γ̱�");   //����
	private Container cont = frame.getContentPane();
	
	private JList<String> list = null;
	
	private JButton regist = new JButton("ȷ �� ѡ �� ");
	
	public Selectclass(){
		Font fnt1 = new Font("Serief", Font.BOLD, 24);
		infoLab1.setFont(fnt1);
		//�����ݿ⣬���ò�������,д������
		String nations[] = {"�й�","����","�ձ�","����","̩��","Ӣ��","����","�ձ�","����","̩��","Ӣ��"
				,"����","�ձ�","����","̩��","Ӣ��","����","�ձ�","����","̩��","Ӣ��"
				,"����","�ձ�","����","̩��","Ӣ��","����","�ձ�","����","̩��","Ӣ��"
				,"����","�ձ�","����","̩��","Ӣ��","����","�ձ�","����","̩��","Ӣ��","����","�ձ�","����","̩��","Ӣ��"};
		this.list = new JList<String>(nations);
		list.setBorder(BorderFactory.createTitledBorder("���пγ̣�"));
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.addListSelectionListener(this);
		cont.add(new JScrollPane(this.list));           //������
		frame.setLayout(null);
		
		infoLab1.setBounds(235, 20, 220, 30);   //�����
		regist.setBounds(155, 520, 220, 30);
		list.setBounds(30, 50, 500, 450);
		
		frame.add(this.list);
		
		frame.add(infoLab1);             //�����
		frame.add(regist); 
		
		
		this.frame.setBounds(500, 100, 600, 600);
		this.frame.setVisible(true);
		
		regist.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//ȷ��ѡ��
				int temp[] = list.getSelectedIndices();
				for(int i = 0;i<temp.length;i++){
				list.getModel().getElementAt(i);
				
				}
			}

		});
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
