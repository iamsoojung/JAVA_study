package chapter_9;

import java.awt.*;
import javax.swing.*;

public class ex9_3 extends JFrame{
	public ex9_3() {
		setTitle("나의 정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(8,2,0,3));
		c.add(new JLabel("성명"));
		c.add(new JTextField("김수정"));
		c.add(new JLabel("학번"));
		c.add(new JTextField("20116965"));
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학전공"));
		c.add(new JLabel("장래희망"));
		c.add(new JTextField("개발자"));
		c.add(new JLabel("여름방학계획"));
		c.add(new JTextArea("다이어트, 운전 면허 따기"));
		c.add(new JLabel("다음학기계획"));
		c.add(new JTextArea("복습 매일매일하기"));
		c.add(new JLabel("좌우명"));
		c.add(new JTextArea("피하지 못하면 즐겨라"));
		c.add(new JLabel("내인생의멘토"));
		c.add(new JTextArea("우리 엄마"));
		
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new ex9_3();
	}
}