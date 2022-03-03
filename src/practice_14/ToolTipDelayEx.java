package practice_14;

import javax.swing.*;
import java.awt.*;

public class ToolTipDelayEx extends JFrame {
	public ToolTipDelayEx() {
		setTitle("���� �����ð� ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel cherryLabel = new JLabel(new ImageIcon("C:\\images\\cherry.jpg"));
		cherryLabel.setToolTipText("ü�� �̹��� ���");
		JLabel appleLabel = new JLabel(new ImageIcon("C:\\images\\apple.jpg"));
		appleLabel.setToolTipText("��� �̹��� ���");
		c.add(cherryLabel);
		c.add(appleLabel);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ToolTipDelayEx();
	}

}
