package practice_2;

/*사각형 사이에 사각형이 겹치는지 판별
inRect(x,y,retx1,rety1,retx2, rety2) 메소드 생성*/

import java.util.Scanner;

public class Main_3 {
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x>=rectx1 && x<=rectx2) && (y>=rectx1 && y<=recty2)) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input the first coordination(x1, y1)>> ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("Input the second coordination(x2, y2)>> ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if (inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200) || inRect(100, 100, x1, y1, x2, y2) || inRect(200, 200, x1, y1, x2, y2)) {
			System.out.println("Yes, two rectangles are collided.");
		}
		else {
			System.out.println("No, two rectangles are NOT collided.");
		}
		
		scanner.close();

	}


}
