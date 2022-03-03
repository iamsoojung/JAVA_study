package chapter_9;

import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300X300 스윙 프레임 만들기");
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
// 여러개의 클래스가 존재하고 main 클래스가 따로 있을 때, main메소드만 public으로 해야함