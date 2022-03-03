package practice_4;

public class Main_1 {
	public static void main(String [] arg) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}

class TV {
	String maker;
	int year;
	int size;

	public TV(String m, int y, int s) {
		maker = m;
		year = y;
		size = s;
	}
	public void show() {
		System.out.println(maker + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
}
