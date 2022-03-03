package practice_3;

public class Main_4 {

	public static void main(String[] args) {
		for(int n=1; n<=99; n++){
			int num2 = n/10;							// num2 = 십의 자리
			if(num2 == 0) {								// 한자리 숫자일때
				if(n%3==0) {							// 한자리 3배수
					System.out.println(n + " 박수 짝");
				}
			}
			else {
				int num1 = n%10;						// num1 = 일의 자리
				if(num2%3==0) {							// 두자리 숫자일때
					if(num1%3==0 && num1!=0) {			// 두자리 3배수
						System.out.println(n + " 박수 짝짝");
					}
					else {								// 한자리 3배수
						System.out.println(n + " 박수 짝");
					}
				}
				else {									// 한자리 숫자일때
					if(num1%3==0 && num1!=0) {			// 한자리 3배수
						System.out.println(n + " 박수 짝");	
					}
				}
				
			}
			
		}

	}

}
