package practice_3;

public class Main_4 {

	public static void main(String[] args) {
		for(int n=1; n<=99; n++){
			int num2 = n/10;							// num2 = ���� �ڸ�
			if(num2 == 0) {								// ���ڸ� �����϶�
				if(n%3==0) {							// ���ڸ� 3���
					System.out.println(n + " �ڼ� ¦");
				}
			}
			else {
				int num1 = n%10;						// num1 = ���� �ڸ�
				if(num2%3==0) {							// ���ڸ� �����϶�
					if(num1%3==0 && num1!=0) {			// ���ڸ� 3���
						System.out.println(n + " �ڼ� ¦¦");
					}
					else {								// ���ڸ� 3���
						System.out.println(n + " �ڼ� ¦");
					}
				}
				else {									// ���ڸ� �����϶�
					if(num1%3==0 && num1!=0) {			// ���ڸ� 3���
						System.out.println(n + " �ڼ� ¦");	
					}
				}
				
			}
			
		}

	}

}
