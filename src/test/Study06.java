package test;

public class Study06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 100; // 1 ~ 100, 100의 값을 변경하기 위한 변수 
		int sum = 0; // 최종값
		int i; // 더하는 값
		
		
		//1부터 100까지 합 구하다가 합이 100 이상이면 멈추기
		//마지막으로 더한 수와 합을 출력하세요.
		for (i = 0;i <= value; i++) {
			if (sum < 100) {
				sum += i;
//				System.out.println(sum); 
			}
			
			else {
//				System.out.println("브레이크 시점 확인");
				break;
			}
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("마지막값 : " + i);
		
		
	}

}
