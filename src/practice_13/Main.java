package practice_13;

import java.awt.Graphics;
import javax.swing.*;

public class Main extends JFrame{
	MyPanel p = new MyPanel();
	
	public Main() {
		setTitle("그래픽 다각형 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		setContentPane(p);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int w= getWidth();
			int h = getHeight();
			int x[] = {w/2, w, w/2, 0};
			int y[] = {0, h/2, h, h/2};
			for (int i=0; i<10; i++) {
				g.drawPolygon(x, y, 4);
				y[0] += 10;
				x[1] -= 10;
				y[2] -= 10;
				x[3] += 10;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
