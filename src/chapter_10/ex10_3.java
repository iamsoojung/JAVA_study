package chapter_10;

// p582 10�� 4��
// ���� Ű�� ���� ȸ��

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex10_3 extends JFrame {
	public ex10_3() {
		setTitle("Left Ű�� ���ڿ� �̵�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel l = new JLabel("Love Java");
		c.add(l);
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					String text = l.getText();
					l.setText(text.substring(1) + text.charAt(0));
				}
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex10_3();

	}

}