package practice_6;

public class Main_1 {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 20);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))	System.out.println("같은 원");
		else	System.out.println("서로 다른 원");
	}
}
class Circle {
	private int x;
	private int y;
	private int r;
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public String toString() {
		return ("Circle(" + x + "," + y +")" + "반지름" + r);
	}
	public boolean equals(Object obj) {
		Circle circle = (Circle)obj;
		if(x == circle.x && y == circle.y)	return true;
		else return false;
	}
}