package practice_4;

import java.util.Scanner;
public class Main_4 {
	public static void main(String[] args) {
		DicApp dicapp = new DicApp();
		dicapp.run();
	}
}

class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng (String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return (DicApp.getPostPosition(word, "은 ", "는 ") + eng[i]);
			}
		}
		return "false";
	}
}
class DicApp{
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			String word = scanner.next();
			
			if(word.equals("그만"))	break;
			
			String result = Dictionary.kor2Eng(word);
			if(result.equals("false")) {
				System.out.println(word + "는 저의 사전에 없습니다.");
			}
			else {
				System.out.println(result);
			}
		}
		scanner.close();
	}
	public static final String getPostPosition(String name, String firstValue, String secondValue) {
		char lastName = name.charAt(name.length() - 1);
		if (lastName < 0xAC00 || lastName > 0xD7A3) { return name; }	//한글이 제일 처음과 끝의 범위 밖일 경우는 오류
		String seletedValue = (lastName - 0xAC00) % 28 > 0 ? firstValue : secondValue;
		return name+seletedValue;
	}
}