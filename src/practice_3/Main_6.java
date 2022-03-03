package practice_3;

import java.util.Scanner;
import java.util.InputMismatchException;		//예외

public class Main_6{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				System.out.print(num1 + "x" + num2 + "=" + num1*num2);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine();			// 이미 입력한 값 모두 제거
			}
		}
		scanner.close();
	}
}