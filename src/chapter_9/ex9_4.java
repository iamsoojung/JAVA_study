package chapter_9;

// p532 9장 6번
// 20개의 10X10 크기의 파란색의 JLabel 컴포넌트가
// 프레임 내의 (50, 50) 위치에서 (250, 250) 영역에서 
// 랜덤한 위치에 출력되도록 스윙프로그램을 작성해라
// 프레임 크기는 300X300으로 하라

import java.awt.*;
import javax.swing.*;

public class ex9_4 extends JFrame {
	public ex9_4() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0; i<20; i++) {
			JLabel l = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			l.setSize(10, 10);
			l.setLocation(x, y);
			l.setOpaque(true);
			l.setBackground(Color.BLUE);
			c.add(l);
		}
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String args[]) {
		new ex9_4();
	}
}
