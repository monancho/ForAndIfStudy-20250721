package test;

public class Study04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 100; // 1 ~ 100, 100의 값을 변경하기 위한 변수 
		int sumA = 0; // 짝수 합
		int sumB = 0; // 홀수 합
		
		
		// 1부터 100까지 짝수와 홀수 개수 세기
		for (int i = 0;i <= value; i++) {
			if (i % 2 == 0) {
				sumA += i;
			}
			
			else {
				sumB += i;
			}
			
		}
		System.out.println("짝수 합 : " + sumA);
		System.out.println("홀수 합 : " + sumB);
		
		
		
		//경계선
	}

}
