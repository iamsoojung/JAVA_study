package practice_4;

// 직사각형 표현 Rectangle 클래스
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		int x, y, w, h;
		Scanner scanner = new Scanner(System.in);
	    Rectangle t = new Rectangle(1, 1, 10, 10);
	    x = scanner.nextInt();
	    y = scanner.nextInt();
	    w = scanner.nextInt();
	    h = scanner.nextInt();
	    Rectangle r = new Rectangle(x, y, w, h);
	    x = scanner.nextInt();
	    y = scanner.nextInt();
	    w = scanner.nextInt();
	    h = scanner.nextInt();
	    Rectangle s = new Rectangle(x, y, w, h);
	    r.show();
	    System.out.println("s의 면적은 " + s.square());
	    if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
	    if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	    
	    scanner.close();
	}
}

class Rectangle {
	int x, y, width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return width*height;
	}
	void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	public Boolean contains(Rectangle r) {
		if(this.x < r.x && this.y < r.y&& this.x+this.width > r.x+r.width && this.y+this.height > r.y+r.height)
			return true;
		else
			return false;
	}
}