package chapter_11;

// p638 11장 10번
// 10(0~9)개의 레이블 순서대로 클릭
// 모두 클릭하면 다시 10개의 레이블을
// 랜덤한 위치에 배치
// 반드시 번호 순으로 클릭

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex11_4 extends JFrame {
	int nowindex;
	JLabel[] l = new JLabel[10];
	public ex11_4() {
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0; i<l.length; i++) {
			l[i] = new JLabel(Integer.toString(i));
			l[i].setSize(15, 15);
			l[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JLabel t = (JLabel)e.getSource();
					int n = Integer.parseInt(t.getText());
					if(n==nowindex) {
						t.setVisible(false);
						nowindex++;
					}
					if(nowindex==10) {
						setting();
					}
				}
			});
			c.add(l[i]);
		}
		setting();
		
		setSize(500, 500);
		setVisible(true);
	}
	public void setting() {
		nowindex = 0;
		for (int i=0; i<10; i++) {
			int x = (int)(Math.random()*300); 
			int y = (int)(Math.random()*300);
			l[i].setLocation(x, y);
			l[i].setVisible(true);
		}
		
	}
	public static void main(String [] args) {
		new ex11_4();
	}
}
