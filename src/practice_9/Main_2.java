package practice_9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main_2 extends JFrame {
	public Main_2() {
		setTitle("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		setSize(300,200);
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
	public static void main(String [] args) {
		new Main_2();
	}
}
