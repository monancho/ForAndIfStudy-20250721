package array;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = {90, 80, 70, 100, 85}; 
		int total = 0;
		
		//다음 값 들의 평균을 계산하여 출력하시오.(향상된 for 문 사용)	
		for (int num : value) total += num;
		
		//출력값
		System.out.println("모든 값의 평균 : "+ (total / value.length));
	}

}
