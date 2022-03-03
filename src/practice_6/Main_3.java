package practice_6;

import java.util.*;
public class Main_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = null;
		
		while(true) {
			System.out.print(">>");
			str = scanner.nextLine();
			
			if(str.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			
			String num[] = str.split(" ");
			System.out.println("어절 개수는 " + num.length);
		}
		scanner.close();
	}
}