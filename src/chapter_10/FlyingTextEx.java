package chapter_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame{
	private final int FLYING_UNIT = 10;
	private JLabel l = new JLabel("HELLO");
	public FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		l.setSize(100, 20);
		l.setLocation(50, 50);
		c.add(l);
		
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_UP:
				l.setLocation(l.getX(), l.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				l.setLocation(l.getX(), l.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				l.setLocation(l.getX()-FLYING_UNIT, l.getY());
				break;
			case KeyEvent.VK_RIGHT:
				l.setLocation(l.getX()+FLYING_UNIT, l.getY());
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
	}
}
