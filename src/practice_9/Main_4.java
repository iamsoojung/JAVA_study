package practice_9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main_4 extends JFrame {
	JLabel label = new JLabel("Love Java");
	public Main_4() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label);

		c.addKeyListener(new MyKeyAdapter());
		setSize(300,200);
		setVisible(true);
		//c.setFocusable(true);
		//c.requestFocus();
	}
	
	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				
				String text = label.getText();
				String front = text.substring(0,1);
				String last = text.substring(1);
				String str = last.concat(front);
				label.setText(str);
			}
		}
	}
	public static void main(String [] args) {
		new Main_4();
	}
}
