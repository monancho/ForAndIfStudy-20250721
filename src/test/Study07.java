package test;

public class Study07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 100; // 1 ~ 100, 100의 값을 변경하기 위한 변수 
		int total = 0; // 최종 값
		
		//1부터 100까지 홀수는 더하고 짝수는 빼기
		for (int i = 0;i <= value; i++) {
			if (i%2 == 0) {
				total -= i;
			}
			else {
				total += i;
			}
		}
		System.out.println("최종 값 : " + total);
		
		
		//경계선
	}

}
