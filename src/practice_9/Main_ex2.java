package practice_9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main_ex2 extends JFrame {
	public Main_ex2() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);

		setSize(350, 150);
		setVisible(true);	
	}
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");
			Main_ex2.this.setTitle(b.getText());
		}
	}

	public static void main(String [] args) {
		new Main_ex2();
	}
}