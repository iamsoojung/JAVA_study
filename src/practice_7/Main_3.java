package practice_7;

import java.util.*;

public class Main_3 {
	public static void main(String[] args) {
		CustomerManager man = new CustomerManager();
		man.run();
	}
}
class CustomerManager{
  	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private Scanner scanner = new Scanner(System.in);
	
	public CustomerManager() {}
  
  	public void run() {
  		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
  		while(true) {
  			System.out.print("�̸��� ����Ʈ �Է�>> ");
  			String name = scanner.next();
  			if(name.equals("�׸�"))	break;
  			int point = scanner.nextInt();
  			
  			Integer n = map.get(name);
  			if(n != null) {
  				point += n;
  			}
  			map.put(name, point);
  			printAll();
  		}
    }
  	void printAll() {  // HashMap�� ��� ���Ҹ� ����ϴ� �޼ҵ�
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
        	String name = it.next();
        	int point = map.get(name);
        	System.out.print("(" + name + ", " + point + ")");
        }
        System.out.println();
    }
}
