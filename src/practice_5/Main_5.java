package practice_5;

import java.util.Scanner;
public class Main_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char c = scanner.next().charAt(0);
		switch(c) {
		case '+' :
			Add add = new Add();
			add.setValue(a, b);
			result = add.calculate();
			System.out.println(add.calculate());
			break;
		case '-' :
			Sub sub = new Sub();
			sub.setValue(a, b);
			result = sub.calculate();
			System.out.println(sub.calculate());
			break;
		case '*' :
			Mul mul = new Mul();
			mul.setValue(a, b);
			result = mul.calculate();
			System.out.println(mul.calculate());
			break;
		case '/' :
			Div div = new Div();
			div.setValue(a, b);
			result = div.calculate();
			if(result == -1) {
				System.out.print("계산할 수 없습니다.");
				break;
			}
			System.out.println(div.calculate());
			break;
		default :
			System.out.println("잘못된 연산자입니다.");
			scanner.close();
			return;
		}
		scanner.close();
	}
}
abstract class Calc { 
	protected int a;
	protected int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}
class Add extends Calc {
	public int calculate() {
		return a + b;
	}
}
class Sub extends Calc {
	public int calculate() {
		return a - b;
	}
}
class Mul extends Calc {
	public int calculate() {
		return a * b;
	}
}
class Div extends Calc {
	public int calculate() {
		if (b == 0)	{
			return -1;
		}
		return a/b;
	}
}
