package practice_7;

import java.util.*;
public class Main_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> stack = new Vector<Integer>();
		while(true) {
			int avg = 0;
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int n = scanner.nextInt();
			if(n==0)	break;
			stack.add(n);
			for(int i=0; i<stack.size(); i++) {
				System.out.print(stack.get(i) + " ");
				avg += stack.get(i);
			}
			System.out.println();
			avg /= stack.size();
			System.out.println("현재 평균 " + avg);
		}
		scanner.close();
	}
}