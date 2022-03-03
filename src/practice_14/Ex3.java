package practice_14;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex3 extends JFrame {
	public Ex3() {
		setTitle("20116965-김수정");
		createMenu();
		setSize(300, 300);
		setVisible(true);
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[3];
		String[] itemTitle = {"3.게임시작", "4.계산기", "5.자바란?"};
		
		JMenu Menu1 = new JMenu("1번");
		JMenu Menu2 = new JMenu("2-1번");
		JMenu Menu3 = new JMenu("2-2번");
		JMenu Menu4 = new JMenu("3,4,5번");
		
		Menu1.add(new JMenuItem("실행"));
		
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
			if(cmd.equals("5.자바란?")) {
				new newWindow();
			}
		}
	}
	class newWindow extends JFrame {
		newWindow() {
			setTitle("자바에 대한 설명");
			JPanel NewWindowContainer = new JPanel();
			setContentPane(NewWindowContainer);
			JTextArea ta = new JTextArea("자바는 객체지향 언어입니다.");
			JTextArea tb = new JTextArea("플랫폼에 독립적인 장점을 가지고 있지만,");
			JTextArea tc = new JTextArea("처리 속도가 중요한 애플리케이션에는 적합하지 않습니다.");
			JTextArea td = new JTextArea("자바는 썬 마이크로시스템즈의 제임스 고슬링과 다른 연구원들이 개발하였습니다.");
			
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
