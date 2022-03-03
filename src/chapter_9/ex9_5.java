package chapter_9;

// p533 9장 7번
// JButton, JLabel, JTextField 사용
// 계산기

import java.awt.*;
import javax.swing.*;

public class ex9_5 extends JFrame {
	public ex9_5() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String args[]) {
		new ex9_5();
	}
}
class NorthPanel extends JPanel {
	public NorthPanel() {
		add(new JLabel("수식입력"));
		add(new JTextField(16));	// 길이 설정
		setBackground(Color.GRAY);
	}
}
class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(new GridLayout(4, 4, 2, 2));
		JButton b[] = {new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/")};
		
		for(int i=0; i<10; i++) {
			add(new JButton(Integer.toString(i)));
		}
		add(new JButton("CE"));
		add(new JButton("계산"));
		for(int j=0; j<b.length; j++) {
			b[j].setBackground(Color.BLUE);
			add(b[j]);
		}
	}
}
class SouthPanel extends JPanel {
	public SouthPanel() {
		add(new JLabel("계산 결과"));
		add(new JTextField(16));
		setBackground(Color.YELLOW);
	}
}



