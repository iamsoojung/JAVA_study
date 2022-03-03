package practice_5;

public class Main_3 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // BLACK ���� (0,0) ��ġ�� ��
	    System.out.println(zeroPoint.toString() + "�Դϴ�.");
	    ColorPoint cp = new ColorPoint(10, 10);
	    cp.setXY(5, 5);
	    cp.setColor("RED");
	    System.out.println(cp.toString() + "�Դϴ�.");
	}
}
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class ColorPoint extends Point {
	public String color;
	public ColorPoint() {
		this(0,0);
	}
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return (color + "���� (" + getX() + "," + getY() +")�� ��");
	}
}