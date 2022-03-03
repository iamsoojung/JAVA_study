package practice_4;

import java.util.Scanner;
public class Main_3{
  public static void main(String [] arg) {
    PhoneBook phonebook = new PhoneBook();
    phonebook.run();
  }
}

class Phone {
	// 멤버 변수
	private String name;
	private String tel;
	
	// 생성자
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

class PhoneBook {
	// 멤버 변수
	private Scanner scanner= new Scanner(System.in);
	private Phone [] pArray;
	String name, tel;
	int i, j;
	
	// 생성자
	public PhoneBook() {
		int num=0;
		
		while(true){
			System.out.print("인원수>>");
			num = scanner.nextInt();
			if(num>0) {
				pArray = new Phone[num];
				break;
			}
		}
		for(i=0; i<pArray.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = scanner.next();
			tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	public void run() {
		int j;
		while(true) {
			System.out.print("검색할 이름>>");
			name = scanner.next();
			
			for (j=0; j<pArray.length; j++) {
				if(pArray[j].getName().equals(name)) {
					System.out.println(name + "의 번호는 " + search(name) + " 입니다.");
					break;
				}
			}
			if(name.equals("그만")) {
				break;
			}
			if(j == pArray.length) {
				System.out.println(name + " 이 없습니다.");
			}
		}
		scanner.close();
	}
	public String search(String name) {
		for (int i=0; i<pArray.length; i++) {
			if(pArray[i].getName().equals(name)) {
				return pArray[i].getTel();
			}
		}
		return null;
	}
}

// scanner 중복 선언하면 안된다! (변수도 중복선언하면 안되는 것처럼)
// scanner.close()는 클래스 안의 메소드 안에 선언되어야 함
// name == "그만" 이 아니라 name.equals("그만")으로 해야함 <문자열이 동일한지 판단 시>