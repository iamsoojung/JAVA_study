package practice_6;

import java.util.*;
public class Main_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = null;
		
		while(true) {
			System.out.print(">>");
			str = scanner.nextLine();
			
			if(str.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			
			String num[] = str.split(" ");
			System.out.println("���� ������ " + num.length);
		}
		scanner.close();
	}
}