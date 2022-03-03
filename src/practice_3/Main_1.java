package practice_3;

/* 배열 원소 출력
	반복문 범위 확인!!! */

public class Main_1 {

	public static void main(String[] args) {
		int n[][] = {{1}, {1, 2, 3}, {1}, {1,2,3,4}, {1,2}};
		
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}

}
