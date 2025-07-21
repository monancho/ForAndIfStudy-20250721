package test;

public class Study05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 50; // 50의 값을 변경하기 위한 변수 
		
		
		//정수 50의 약수 출력
		for (int i = 1; i <= value; i++) {
			if (value % i == 0) {
				System.out.println(i);
			}
		}
	}

}
