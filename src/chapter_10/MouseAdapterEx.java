package chapter_10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterEx extends JFrame{
	private JLabel l = new JLabel("Hello");
	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		c.setLayout(null);
		
		l.setSize(50,20);
		l.setLocation(30, 30);
		c.add(l);
		
		setSize(250, 250);
		setVisible(true);
	}
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			l.setLocation(x, y);
		}
	}
	public static void main(String args[]) {
		new MouseAdapterEx();
	}
}
