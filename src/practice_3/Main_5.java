package practice_3;

// 문자열 비교 후, 일치하지 않을 경우 확인!
import java.util.Scanner;
public class Main_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		int i=0;
		
		do {
			System.out.print("과목 이름>>");
			String str = scanner.next();
			
			if(str.equals("그만"))	break;
			
			for (i=0; i<course.length; i++) {
				if(course[i].equals(str)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
			}
			if (i==course.length) {
				System.out.println("없는 과목입니다.");
			}
				
		} while(true);
		scanner.close();
	}
}
