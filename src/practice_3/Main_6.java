package practice_3;

import java.util.Scanner;
import java.util.InputMismatchException;		//����

public class Main_6{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				System.out.print(num1 + "x" + num2 + "=" + num1*num2);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();			// �̹� �Է��� �� ��� ����
			}
		}
		scanner.close();
	}
}