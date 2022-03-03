package practice_2;

/*삼각형을 만들 수 있는지 판별
가장 큰 수, 작은 수 끼리 합 등 2개의 변수 생성하여 판별*/

import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input 3 integer values>> ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int max_num , min_add_num;
			
		if(num1>num2) {
			max_num = num1;
			if(num3>num1) {
				max_num = num3;
				min_add_num = num1+num2;
			}
			else {
				min_add_num = num2+num3;
			}
		}
			
		else {
			max_num = num2;
			if(num3>num2) {
				max_num = num3;
				min_add_num = num1+num2;
			}
			else {
				min_add_num = num1+num3;
			}
		}
			
		if (max_num < min_add_num) {
			System.out.println("Yes, this is a triangle.");
		}
		else {
			System.out.println("No, this is NOT a triangle.");
		}
			
		scanner.close();

	}

}
