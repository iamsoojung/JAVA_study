package practice_8;

import java.awt.*;
import javax.swing.*;

public class Main_3 extends JFrame {
	public Main_3() {
		setTitle("���� ���ؼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		GridLayout grid = new GridLayout(8,2, 10, 10);
		grid.setVgap(5);
		
		c.setLayout(grid);
		c.add(new JLabel("����"));
		c.add(new JTextField("�����"));
		c.add(new JLabel("�й�"));
		c.add(new JTextField("20116965"));
		c.add(new JLabel("�а�"));
		c.add(new JTextField("��ǻ�Ͱ�������"));
		c.add(new JLabel("�巡���"));
		c.add(new JTextArea("����Ʈ���� �����Ͼ�"));
		c.add(new JLabel("�������� ��ȹ"));
		c.add(new JTextArea("���� ���� ����"));
		c.add(new JLabel("�����б� ��ȹ"));
		c.add(new JTextArea("���� ���躸�� "));
		c.add(new JLabel("�¿��"));
		c.add(new JTextArea("�λ��� ª�� ����"));
		c.add(new JLabel("�� �λ��� ����"));
		c.add(new JTextArea("����"));
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main_3();
	}
}
