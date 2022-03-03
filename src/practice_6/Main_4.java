package practice_6;

import java.util.Scanner;
public class Main_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
		
		String str = scanner.nextLine();
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.substring(i+1));
			System.out.println(str.substring(0,i+1));
		}
		scanner.close();
	}
}
