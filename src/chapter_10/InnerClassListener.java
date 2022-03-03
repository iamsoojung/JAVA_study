package chapter_10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
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
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) {
				b.setText("�׼�");
			}
			else {
				b.setText("Action");
			}
			InnerClassListener.this.setTitle(b.getText());
		}
	}
	public static void main(String args[]) {
		new InnerClassListener();
	}
}
