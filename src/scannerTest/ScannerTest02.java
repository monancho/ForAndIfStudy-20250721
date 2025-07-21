package scannerTest;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("당신의 이름 : ");
			String str = scanner.nextLine();
			System.out.println("당신의 나이 : ");
			int age = scanner.nextInt();
			if(age==0) {
				System.out.println("프로그램을 종료 하겠다.");
				break;
			}
		System.out.println("이름 : "+ str);
		System.out.println("나이 : "+ age);
	}
	}

}
