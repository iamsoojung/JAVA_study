package chapter_9;

// p532 9�� 6��
// 20���� 10X10 ũ���� �Ķ����� JLabel ������Ʈ��
// ������ ���� (50, 50) ��ġ���� (250, 250) �������� 
// ������ ��ġ�� ��µǵ��� �������α׷��� �ۼ��ض�
// ������ ũ��� 300X300���� �϶�

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
