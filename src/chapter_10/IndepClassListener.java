package chapter_10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b = new JButton("Action");
		b.addActionListener(new MyActionListener());
		c.add(b);
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String args[]) {
		new IndepClassListener();
	}
}
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("�׼�");
		}
		else {
			b.setText("Action");
		}
	}
}
