package chapter_11;

import java.awt.*;
import javax.swing.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("C:/images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("C:/images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("C:/images/pressedIcon.gif");

		JButton b = new JButton("call~~", normalIcon);
		b.setRolloverIcon(rolloverIcon);	// ���콺 �ö� ��
		b.setPressedIcon(pressedIcon);		// ���콺 Ŭ�� ��
		
		c.add(b);
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}

}
