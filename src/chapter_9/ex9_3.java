package chapter_9;

import java.awt.*;
import javax.swing.*;

public class ex9_3 extends JFrame{
	public ex9_3() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(8,2,0,3));
		c.add(new JLabel("����"));
		c.add(new JTextField("�����"));
		c.add(new JLabel("�й�"));
		c.add(new JTextField("20116965"));
		c.add(new JLabel("�а�"));
		c.add(new JTextField("��ǻ�Ͱ�������"));
		c.add(new JLabel("�巡���"));
		c.add(new JTextField("������"));
		c.add(new JLabel("�������а�ȹ"));
		c.add(new JTextArea("���̾�Ʈ, ���� ���� ����"));
		c.add(new JLabel("�����б��ȹ"));
		c.add(new JTextArea("���� ���ϸ����ϱ�"));
		c.add(new JLabel("�¿��"));
		c.add(new JTextArea("������ ���ϸ� ��ܶ�"));
		c.add(new JLabel("���λ��Ǹ���"));
		c.add(new JTextArea("�츮 ����"));
		
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new ex9_3();
	}
}