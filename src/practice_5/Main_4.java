package practice_5;

import java.util.Scanner;
public class Main_4 {
	public static void main(String[] args) {
		StackApp.run();
	}
}
interface Stack {
	int length();	// ���� ���ÿ� ����� ���� ����
	int capacity();	// ������ ��ü ���� ������ ���� ����
	String pop();	// ������ ��(top)�� �Ǽ� ����
	boolean push(String val);	// ������ ��(top)�� ����� �Ǽ� ����
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
				System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int num = scanner.nextInt();
		StringStack stack = new StringStack(num);
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String val = scanner.next();
			if(val.equals("�׸�"))	break;
			if(!stack.push(val)) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		int length = stack.length();
		for(int i = 0; i<length; i++) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
		scanner.close();
	}
}
