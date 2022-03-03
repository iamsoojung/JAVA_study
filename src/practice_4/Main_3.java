package practice_4;

import java.util.Scanner;
public class Main_3{
  public static void main(String [] arg) {
    PhoneBook phonebook = new PhoneBook();
    phonebook.run();
  }
}

class Phone {
	// ��� ����
	private String name;
	private String tel;
	
	// ������
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
	// ��� ����
	private Scanner scanner= new Scanner(System.in);
	private Phone [] pArray;
	String name, tel;
	int i, j;
	
	// ������
	public PhoneBook() {
		int num=0;
		
		while(true){
			System.out.print("�ο���>>");
			num = scanner.nextInt();
			if(num>0) {
				pArray = new Phone[num];
				break;
			}
		}
		for(i=0; i<pArray.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name = scanner.next();
			tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	
	public void run() {
		int j;
		while(true) {
			System.out.print("�˻��� �̸�>>");
			name = scanner.next();
			
			for (j=0; j<pArray.length; j++) {
				if(pArray[j].getName().equals(name)) {
					System.out.println(name + "�� ��ȣ�� " + search(name) + " �Դϴ�.");
					break;
				}
			}
			if(name.equals("�׸�")) {
				break;
			}
			if(j == pArray.length) {
				System.out.println(name + " �� �����ϴ�.");
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

// scanner �ߺ� �����ϸ� �ȵȴ�! (������ �ߺ������ϸ� �ȵǴ� ��ó��)
// scanner.close()�� Ŭ���� ���� �޼ҵ� �ȿ� ����Ǿ�� ��
// name == "�׸�" �� �ƴ϶� name.equals("�׸�")���� �ؾ��� <���ڿ��� �������� �Ǵ� ��>