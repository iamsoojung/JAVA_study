package chapter_9;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.ORANGE);
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("OK"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);	// true�ؾ� �������� ȭ�鿡 ��Ÿ���� ��
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
