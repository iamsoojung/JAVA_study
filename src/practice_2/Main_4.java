package practice_2;

/*  사칙연산
 문자형 (char) 입력받는 방법 유의!
 scanner.next().charAt(0)   */

import java.util.Scanner;

public class Main_4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a equation >>");
		float num1 = scanner.nextFloat();
		char exp = scanner.next().charAt(0);
		float num2 = scanner.nextFloat();
		float result = 0;
		
		switch(exp) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " " + exp + " " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " " + exp + " " + num2 + " = " + result);
			break;
		case '*':
			result = num1*num2;
			System.out.println(num1 + " " + exp + " " + num2 + " = " + result);
			break;
		case '/':
			if (num2 == 0) {
				System.out.print("Can not divide by 0");
				break;
			}
			result = num1 / num2;
			System.out.println(num1 + " " + exp + " " + num2 + " = " + result);
			break;
		}
		
		scanner.close();
		
	}
}