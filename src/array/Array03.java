package array;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = {1, 3, 7, 3, 3, 5, 3, 6, 9, 3, 3, 3};
		int count = 0;
		
		//다음 숫자열에서 3의 갯수가 몇개 인지 출력하시오\
		for (int i=0;i < value.length ;i++) 
			if (value[i] == 3 ) count++; // 3의 갯수 카운트
	
		
		//출력값
		System.out.println ("3의 갯수 : " + count);
		
	}

}
