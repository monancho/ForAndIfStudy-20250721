package test;

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 100; // 1 ~ 100, 100의 값을 변경하기 위한 변수 
		
		//1부터 100까지 3의 배수와 5의 배수만 출력
		for (int i=1; i <= value; i++ ) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			else if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}
