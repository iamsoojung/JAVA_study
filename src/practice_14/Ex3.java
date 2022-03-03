package practice_14;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex3 extends JFrame {
	public Ex3() {
		setTitle("20116965-�����");
		createMenu();
		setSize(300, 300);
		setVisible(true);
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[3];
		String[] itemTitle = {"3.���ӽ���", "4.����", "5.�ڹٶ�?"};
		
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
		
		MenuActionListener listener = new MenuActionListener();
		
		Menu4.addActionListener(new MenuActionListener());
		
		for (int i = 0; i < menuItem.length; i++) {
            menuItem[i] = new JMenuItem(itemTitle[i]);
            menuItem[i].addActionListener(listener);
            Menu4.add(menuItem[i]);
        }
		mb.add(Menu1);
		mb.add(Menu2);
		mb.add(Menu3);
		mb.add(Menu4);
		
		setJMenuBar(mb);
	}
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("5.�ڹٶ�?")) {
				new newWindow();
			}
		}
	}
	class newWindow extends JFrame {
		newWindow() {
			setTitle("�ڹٿ� ���� ����");
			JPanel NewWindowContainer = new JPanel();
			setContentPane(NewWindowContainer);
			JTextArea ta = new JTextArea("�ڹٴ� ��ü���� ����Դϴ�.");
			JTextArea tb = new JTextArea("�÷����� �������� ������ ������ ������,");
			JTextArea tc = new JTextArea("ó�� �ӵ��� �߿��� ���ø����̼ǿ��� �������� �ʽ��ϴ�.");
			JTextArea td = new JTextArea("�ڹٴ� �� ����ũ�νý������� ���ӽ� ������ �ٸ� ���������� �����Ͽ����ϴ�.");
			
			NewWindowContainer.add(ta);
			NewWindowContainer.add(tb);
			NewWindowContainer.add(tc);
			NewWindowContainer.add(td);
			
			setSize(500,500);
			setResizable(false);
			setVisible(true);
		}
	}
	public static void main(String [] args) {
		new Ex3();
	}
}
