package test;

public class Study03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 1; // 1 ~ 100, 1의 값을 변경하기 위한 변수
		int max = 100; // 1 ~ 100, 100의 값을 변경하기 위한 변수 
		int sum = 0; // 홀수 합
		
		//1부터 100까지 홀수 합 출력
		for (int i = min; i<=max; i++) {
			if (i % 2 != 0) {
//				System.out.println(i);
				sum += i;
			}
				
				
		}
		System.out.println("min~max의 홀수의 합 : " + sum);
		
		//경계선
	}

}
