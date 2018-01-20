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
	private JFrame frame = new JFrame("�γ̱�");     //��������
	private JLabel infoLab1 = new JLabel("�γ̱�");   //����
	private Container cont = frame.getContentPane();
	private JTextField jtcourse = new JTextField();
	
	private JList<String> list = null;
	private JButton submit = new JButton("ȷ��");
	private JButton regist = new JButton("��           �� ");
	private int jcourse = 0;
	public Te_selectclass(){
		Font fnt1 = new Font("Serief", Font.BOLD, 24);
		infoLab1.setFont(fnt1);
		//�����ݿ⣬���ò�������,д������
		String nations[] = {"�й�","����","�ձ�","����","̩��","Ӣ��"};
		this.list = new JList<String>(nations);
		list.setBorder(BorderFactory.createTitledBorder("����ѧ����"));
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		
		frame.setLayout(null);
		
		infoLab1.setBounds(235, 20, 220, 30);   //�����
		regist.setBounds(155, 520, 220, 30);
		list.setBounds(30, 100, 500, 370);
		
		submit.setBounds(440, 60, 60, 30);
		
		jtcourse.setBounds(350, 60, 80, 30);
		
		frame.add(infoLab1);             //�����
		frame.add(regist);
		frame.add(submit);
		
		frame.add(jtcourse);
		cont.add(this.list);
		
		this.frame.setBounds(500, 100, 600, 600);
		this.frame.setVisible(true);
		
		
		
		
		
		submit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//ȷ��ѡ��
				
				jcourse =Integer.parseInt(jtcourse.getText());
				
			}
		});
		
		regist.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//����excel
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
