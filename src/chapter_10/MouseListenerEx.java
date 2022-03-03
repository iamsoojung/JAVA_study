package chapter_10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
	private JLabel l = new JLabel("Hello");
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		
		l.setSize(50, 20);
		l.setLocation(30, 30);
		c.add(l);
		
		setSize(250, 250);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			l.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String args[]) {
		new MouseListenerEx();
	}
}
