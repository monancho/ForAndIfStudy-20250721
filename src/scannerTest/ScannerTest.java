package scannerTest;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신이 제일 좋아하는 숫자를 입력 : ");
		int num1 = scanner.nextInt(); // 시용자로 부터 정수를 입력 받아 정수 변수  num1에 저장
		System.out.println("당신이 제일 좋아하는 숫자는 " + num1 + " 입니다.");
		scanner.close();
	}

}
