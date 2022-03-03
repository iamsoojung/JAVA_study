package chapter_10;

// p582 10�� 2��
// ���� �ʷϻ�
// �巡�� �ϴ� ���� �����

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex10_2 extends JFrame {
	public ex10_2() {
		setTitle("�巡�뵿�� YELLOw...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	class MyMouseListener extends MouseAdapter {
		public void mouseDragged(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
	public static void main(String args[]) {
		new ex10_2();
	}
}
