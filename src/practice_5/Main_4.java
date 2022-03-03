package practice_5;

import java.util.Scanner;
public class Main_4 {
	public static void main(String[] args) {
		StackApp.run();
	}
}
interface Stack {
	int length();	// 현재 스택에 저장된 개수 리턴
	int capacity();	// 스택의 전체 저장 가능한 개수 리턴
	String pop();	// 스택의 톱(top)에 실수 저장
	boolean push(String val);	// 스택의 톱(top)에 저장된 실수 리턴
}
class StringStack implements Stack {
	private int num;
	private int index;
	private String[] stack;
	public StringStack(int num) {
		this.num = num;
		this.index = 0;
		stack = new String[num];
	}
	public int length() {
		return index;
	}
	public int capacity() {
		return stack.length;
	}
	public String pop() {
		if (index-1 < 0)
			return null;
		index--;
		String s = stack[index];
		return s;
	}
	public boolean push(String val) {
		if (num > index) {
			stack[index] = val;
			index++;
			return true;
		}
		else
			return false;
	}
}
class StackApp {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
				System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int num = scanner.nextInt();
		StringStack stack = new StringStack(num);
		while(true) {
			System.out.print("문자열 입력 >> ");
			String val = scanner.next();
			if(val.equals("그만"))	break;
			if(!stack.push(val)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int length = stack.length();
		for(int i = 0; i<length; i++) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
		scanner.close();
	}
}
