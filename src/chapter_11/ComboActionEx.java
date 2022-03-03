package chapter_11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
	private String fruits[] = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private ImageIcon images[] = { new ImageIcon("C:/images/icon1.png"), new ImageIcon("C:/images/icon2.png"), new ImageIcon("C:/images/icon3.png"), new ImageIcon("C:/images/icon4.png") };
	private JLabel imgLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String> (fruits);
	
	public ComboActionEx() {
		setTitle("�޺��ڽ� Ȱ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		setSize(300, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboActionEx();
	}

}
