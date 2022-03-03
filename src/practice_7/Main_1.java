package practice_7;

import java.util.*;
public class Main_1 {
	public static void printBig(Vector<Integer> v) {
		int big = v.get(0);
		for (int i=1; i<v.size(); i++) {
			if(big < v.get(i)) {
				big = v.get(i);
			}
		}
		System.out.println("���� ū ���� " + big);
	}
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����(-1�� �Էµ� ������)>> ");
		
		while(true) {
			int num = scanner.nextInt();
			if (num == -1)	break;
			v.add(num);
		}
		
		if(v.size() == 0) {
			System.out.print("���� �ϳ��� ����");
			scanner.close();
			return;
		}
		
		printBig(v);
		scanner.close();
	}
}
