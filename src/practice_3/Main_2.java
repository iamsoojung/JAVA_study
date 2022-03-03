package practice_3;

//	별 역순 출력

import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int num = scanner.nextInt();
		
		do {
			if(num<=0) {
				System.out.print("잘못 입력했습니다. ");
				System.out.print("정수를 입력하시오>>");
				num = scanner.nextInt();
			}
			else {
				for (int i=0; i<num; i++) {
					for (int j=0; j<num-i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}
		} while(true);
		
		scanner.close();
	}
}
