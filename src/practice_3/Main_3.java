package practice_3;

/*	���ĺ� ���� ���
   !! ���ĺ� ��� �ϴ°� �ݺ��� ���� +1 ������� !! */

import java.util.Scanner;

public class Main_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		char c;
		
		do {
			c = scanner.next().charAt(0);
			if(c<'a' || c>'z') {
				System.out.print("�߸� �Է��߽��ϴ�. �ٽ� �Է��Ͻÿ�>>");
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
