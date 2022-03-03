package practice_4;

import java.util.Scanner;
public class Main_4 {
	public static void main(String[] args) {
		DicApp dicapp = new DicApp();
		dicapp.run();
	}
}

class Dictionary {
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng (String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return (DicApp.getPostPosition(word, "�� ", "�� ") + eng[i]);
			}
		}
		return "false";
	}
}
class DicApp{
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String word = scanner.next();
			
			if(word.equals("�׸�"))	break;
			
			String result = Dictionary.kor2Eng(word);
			if(result.equals("false")) {
				System.out.println(word + "�� ���� ������ �����ϴ�.");
			}
			else {
				System.out.println(result);
			}
		}
		scanner.close();
	}
	public static final String getPostPosition(String name, String firstValue, String secondValue) {
		char lastName = name.charAt(name.length() - 1);
		if (lastName < 0xAC00 || lastName > 0xD7A3) { return name; }	//�ѱ��� ���� ó���� ���� ���� ���� ���� ����
		String seletedValue = (lastName - 0xAC00) % 28 > 0 ? firstValue : secondValue;
		return name+seletedValue;
	}
}