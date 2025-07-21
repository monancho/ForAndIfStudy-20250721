package array;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = {10, 20, 30, 40, 50};
		int total = value[0];
		
		//아래 숫자들을 모두 곱한 값을 배열을 사용하여 출력하시오.
		for (int i=1; i < value.length; i++) total *= value[i];
		
		//출력값
		System.out.println("최종값 : " + total);
		
			
		
		
	}

}
