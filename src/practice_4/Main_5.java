package practice_4;

import java.util.Scanner;
public class Main_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		
		switch(operator) {
		case '+':
			Add add = new Add();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div div = new Div();
			div.setValue(num1, num2);
			System.out.println(div.calculate());
			break;
		default:
			System.out.println("해당하는 연산이 없습니다.");
		}
		scanner.close();
	}
}
class Add {
	int a, b;
	void setValue(int num1, int num2) {
		this.a = num1;
		this.b = num2;
	}
	int calculate() {
		return a + b;
	}
}
class Sub {
	int a, b;
	void setValue(int num1, int num2) {
		this.a = num1;
		this.b = num2;
	}
	int calculate() {
		return a - b;
	}
}
class Mul {
	int a, b;
	void setValue(int num1, int num2) {
		this.a = num1;
		this.b = num2;
	}
	int calculate() {
		return a * b;
	}
}
class Div {
	int a, b;
	void setValue(int num1, int num2) {
		this.a = num1;
		this.b = num2;
	}
	int calculate() {
		return a / b;
	}
}