package practice_6;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Main_2 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
		String s = null;
		
		while(true) {
			System.out.print(">>");
			s = scanner.nextLine();
			
			if(s.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			StringTokenizer str = new StringTokenizer(s, " ");
			int num = str.countTokens();
			System.out.println("���� ������ " + num);
		}
		scanner.close();
	}
}
