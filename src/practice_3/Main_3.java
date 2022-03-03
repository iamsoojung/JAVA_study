package practice_3;

/*	알파벳 역순 출력
   !! 알파벳 출력 하는것 반복문 범위 +1 해줘야함 !! */

import java.util.Scanner;

public class Main_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char c;
		
		do {
			c = scanner.next().charAt(0);
			if(c<'a' || c>'z') {
				System.out.print("잘못 입력했습니다. 다시 입력하시오>>");
			}
			else {
				for(int i=0; i<c-'a'+1; i++) {
					for (int j='a'; j<=c-i; j++) {
						System.out.print((char)j);
					}
					System.out.println();
				}
				break;
			}
		} while(c <='z');
		
		scanner.close();
	}
}
