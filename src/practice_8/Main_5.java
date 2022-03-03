package practice_8;

import java.awt.*;
import javax.swing.*;


public class Main_5 extends JFrame {
	public Main_5() {
		setTitle("���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JPanel north = new JPanel();
		JPanel center = new JPanel();
		JPanel south = new JPanel();
		
		north.setBackground(Color.LIGHT_GRAY);
		center.setLayout(new GridLayout(4, 4));
		south.setBackground(Color.YELLOW);
		
		c.add(north, BorderLayout.NORTH);
		c.add(center);
		c.add(south, BorderLayout.SOUTH);
		
		JLabel input = new JLabel("�����Է�");
		JTextField text1 = new JTextField(10);
		north.add(input);
		north.add(text1);
		
		JLabel result = new JLabel("�����");
		JTextField text2 = new JTextField(10);
		south.add(result);
		south.add(text2);
		
		for (int i=0; i<16; i++) {
			JButton b = new JButton();
			String str[] = {"CE", "���", "+", "-", "x", "/"};
			center.add(b);
			if (i<10)	b.setText(Integer.toString(i));
			else	b.setText(str[i-10]);
			if(i>11) {
				b.setOpaque(true);
				b.setBackground(Color.CYAN);
			}
		}
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main_5();
	}
}
