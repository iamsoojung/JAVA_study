package practice_3;

// ���ڿ� �� ��, ��ġ���� ���� ��� Ȯ��!
import java.util.Scanner;
public class Main_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		int i=0;
		
		do {
			System.out.print("���� �̸�>>");
			String str = scanner.next();
			
			if(str.equals("�׸�"))	break;
			
			for (i=0; i<course.length; i++) {
				if(course[i].equals(str)) {
					System.out.println(course[i]+"�� ������ "+score[i]);
					break;
				}
			}
			if (i==course.length) {
				System.out.println("���� �����Դϴ�.");
			}
				
		} while(true);
		scanner.close();
	}
}
