package practice_3;

//	�� ���� ���

import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�>>");
		int num = scanner.nextInt();
		
		do {
			if(num<=0) {
				System.out.print("�߸� �Է��߽��ϴ�. ");
				System.out.print("������ �Է��Ͻÿ�>>");
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
