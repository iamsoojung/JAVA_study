package chapter_11;

// p635 11�� 2��
// JTextField �Է� â�� ���ڿ� �Է� ��(Enter)
// JComboBox�� ���������� ����

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex11_3 extends JFrame{
	JTextField tf = new JTextField(10);
	JComboBox combo = new JComboBox();
	public ex11_3() {
		setTitle("JTextField and JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				combo.addItem(t.getText());
				t.setText("");
			}
		});
		
		c.add(tf);
		c.add(combo);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ex11_3();
	}

}
