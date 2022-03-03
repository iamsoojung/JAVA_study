package practice_11;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 

class Frame11 extends JFrame { 
	JPanel jp = new JPanel(); 
	JLabel[] jl = new JLabel[10]; 
	int j = 0; Frame11() { 
		this.setTitle("Focus Practice Frame"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		jp.setLayout(null); 
		for(int i= 0; i <jl.length; i++) { 
			int x = (int)(Math.random()*300); 
			int y = (int)(Math.random()*300); 
			jl[i] = new JLabel(); 
			jl[i].setText(Integer.toString(i)); 
			jl[i].setSize(15, 15); 
			jl[i].setLocation(x, y); 
			jl[i].addMouseListener(new MyMouseListener()); 
			jp.add(jl[i]); 
			} 
		this.add(jp); 
		this.setSize(350, 350); 
		this.setVisible(true); 
		} 
	class MyMouseListener extends MouseAdapter { 
		public void mouseClicked(MouseEvent e) { 
			JLabel label = new JLabel(); 
			label = (JLabel)e.getSource(); 
			if(Integer.parseInt(label.getText()) <= Integer.parseInt(jl[j].getText())) { 
				label.setVisible(false); 
				j++; 
				if(Integer.parseInt(label.getText()) == 9) { 
					for(int i =0; i < jl.length; i++) { 
						int x = (int)(Math.random()*300); 
						int y = (int)(Math.random()*300); 
						jl[i].setLocation(x, y); 
						jl[i].setVisible(true); 
						} 
					} 
				} 
			} 
		} 
	} 
public class Main { 
	public static void main(String[] args) { 
		new Frame11(); 
	}
}
