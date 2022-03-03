package chapter_9;

import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel l = new JLabel("Hello, Press Buttons!");
		l.setSize(200, 20);
		l.setLocation(130, 50);
		c.add(l);
		
		for(int i=1; i<10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setSize(50, 20);
			b.setLocation(i*15, i*15);
			c.add(b);
		}
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new NullContainerEx();
	}
}
