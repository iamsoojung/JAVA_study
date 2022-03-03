package chapter_11;

import java.awt.*;
import javax.swing.*;

public class ListEx extends JFrame{
	private String fruits[] = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private ImageIcon images[] = { new ImageIcon("C:/images/icon1.png"), new ImageIcon("C:/images/icon2.png"), new ImageIcon("C:/images/icon3.png"), new ImageIcon("C:/images/icon4.png") };
	
	public ListEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 문자열 리스트
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		// 이미지 리스트
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		// 리스트 + 스크롤바
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListEx();
	}

}
