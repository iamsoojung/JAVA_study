package practice_6;

import java.util.Scanner;
public class Main_5 {
	public static void main(String[] args) {
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		StringBuffer buffer = new StringBuffer(text);
		
		while(true) {
			System.out.print("���: ");
			String line = scanner.nextLine();
			if(line.equals("�׸�")) {
				System.out.print("�����մϴ�.");
				break;
			}
			String [] token = line.split("!");
			if(token.length != 2) {
				System.out.println("�߸��� ����Դϴ�!");
			}
			else {
				if(token[0].length() == 0 || token[1].length() == 0) {
					System.out.println("�߸��� ����Դϴ�!");
					continue;
				}
				int index = buffer.indexOf(token[0]);
				if(index == -1) {
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				buffer.replace(index, index + token[0].length(), token[1]);
				System.out.println(buffer.toString());
			}
		}
		scanner.close();
	}
}
