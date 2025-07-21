package scannerTest;

import java.util.Scanner;

public class ScannerTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			
			System.out.println("임의의 숫자를 입력하시오.");
			Scanner scanner = new Scanner (System.in);
			
			int num = scanner.nextInt();
				if (num % 2 == 0) {
					System.out.println("짝수");
				}
				else {
					System.out.println("홀수");
				}
				System.out.println("");
			
		}
	}

}
