package chapter_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel l = new JLabel("No Mouse Event");
	public MouseListenerAllEx() {
		setTitle("MouseListener?? MouseMotionListener ????");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.add(l);
		
		setSize(300, 200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener, MouseMotionListener { 
		public void mousePressed(MouseEvent e) {
			l.setText("mousePressed (" + e.getX() + "," + e.getY() + ")" );
		}
		public void mouseReleased(MouseEvent e) {
			l.setText("mouseReleased (" + e.getX() + "," + e.getY() + ")" );
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e) {
			l.setText("MouseDragged (" + e.getX() + "," + e.getY() + ")");
		}
		public void mouseMoved(MouseEvent e) {
			l.setText("MouseMoved (" + e.getX() + "," + e.getY() + ")");
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerAllEx();

	}

}
