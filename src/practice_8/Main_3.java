package practice_8;

import java.awt.*;
import javax.swing.*;

public class Main_3 extends JFrame {
	public Main_3() {
		setTitle("나에 대해서");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		GridLayout grid = new GridLayout(8,2, 10, 10);
		grid.setVgap(5);
		
		c.setLayout(grid);
		c.add(new JLabel("성명"));
		c.add(new JTextField("김수정"));
		c.add(new JLabel("학번"));
		c.add(new JTextField("20116965"));
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학전공"));
		c.add(new JLabel("장래희망"));
		c.add(new JTextArea("소프트웨어 엔지니어"));
		c.add(new JLabel("여름방학 계획"));
		c.add(new JTextArea("운전 면허 따기"));
		c.add(new JLabel("다음학기 계획"));
		c.add(new JTextArea("토익 시험보기 "));
		c.add(new JLabel("좌우명"));
		c.add(new JTextArea("인생은 짧고 굵게"));
		c.add(new JLabel("내 인생의 멘토"));
		c.add(new JTextArea("엄마"));
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main_3();
	}
}
