package practice_14;

import javax.swing.*;

public class Ex2 extends JFrame {
	public Ex2() {
		setTitle("20116965+�����");
		createMenu();
		setSize(300, 300);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu Menu1 = new JMenu("1��");
		JMenu Menu2 = new JMenu("2-1��");
		JMenu Menu3 = new JMenu("2-2��");
		JMenu Menu4 = new JMenu("3,4,5��");
		
		Menu1.add(new JMenuItem("����"));
		
		Menu2.add(new JMenuItem("New"));
		Menu2.add(new JMenuItem("Open"));
		Menu2.add(new JMenuItem("------"));
		Menu2.add(new JMenuItem("Save"));
		Menu2.add(new JMenuItem("SaveAs"));
		
		Menu3.add(new JMenuItem("Open"));
		Menu3.add(new JMenuItem("------"));
		Menu3.add(new JMenuItem("Color"));
		Menu3.add(new JMenuItem("------"));
		Menu3.add(new JMenuItem("Line"));
		Menu3.add(new JMenuItem("Rect"));
		Menu3.add(new JMenuItem("Oval"));
		Menu3.add(new JMenuItem("RndRect"));
		Menu3.add(new JMenuItem("Text"));
		Menu3.add(new JMenuItem("FreeLine"));
		
		Menu4.add(new JMenuItem("3.���ӽ���"));
		Menu4.add(new JMenuItem("4.����"));
		Menu4.add(new JMenuItem("5.�ڹٶ�?"));
		
		mb.add(Menu1);
		mb.add(Menu2);
		mb.add(Menu3);
		mb.add(Menu4);
		
		setJMenuBar(mb);
	}
	public static void main(String [] args) {
		new Ex2();
	}
}