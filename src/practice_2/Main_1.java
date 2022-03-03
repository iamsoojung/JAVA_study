package practice_2;

// 돈 환산 (5만, 만, 천, 5백, 백, 50, 10)

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		System.out.print("Input money>> ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		int money1 = money / 50000;
		money %= 50000;
		int money2 = money / 10000;
		money %= 10000;
		int money3 = money / 1000;
		money %= 1000;
		int money4 = money / 500;
		money %= 500;
		int money5 = money / 100;
		money %= 100;
		int money6 = money / 50;
		money %= 50;
		int money7 = money / 10;
		money %= 10;
		
		if(money1 != 0) {
			System.out.println(money1 + " 50,000won bill(s)");
		}
		
		if(money2 != 0) {
			System.out.println(money2 + " 10,000won bill(s)");
		}
		
		if(money3 != 0) {
			System.out.println(money3 + " 1,000won bill(s)");
		}
		
		if(money4 != 0) {
			if(money4 == 1) {
				System.out.println(money4 + " 500won coin" );
			}
			else {
				System.out.println(money4 + " 500won coin(s)");
			}
		}
		
		if(money5 != 0) {
			System.out.println(money5 + " 100won coin(s)");
		}
		if(money6 != 0) {
			if(money6 == 1) {
				System.out.println(money6 + " 50won coin" );
			}
			else {
				System.out.println(money6 + " 50won coin(s)");
			}
		}
		if(money7 != 0) {
			System.out.println(money7 + " 10won coin(s)");
		}
		
		if(money != 0) {
			System.out.println(money + " 1won coin(s)");
		}
		
		scanner.close();

	}

}
