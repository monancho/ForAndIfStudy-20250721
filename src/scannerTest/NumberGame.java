package scannerTest;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("********숫자 맞추기 게임********");
		System.out.println ("1 ~ 100 사이 숫자를 맞추면 됩니다.");
		
		int count = 0;
		while(true) {
			count++;
				
			Scanner scanner = new Scanner(System.in);
			int comNumber = (int) ((Math.random() * 100) + 1); // 랜덤으로 컴튜터가 생각한 수를 생성.
	//		System.out.println ("랜덤 난수가 생성 됐습니다.");
			System.out.println ("1 ~ 100사이의 숫자를 입력하세요(0 입력시 게임 종료)");
			
			int userNum = scanner.nextInt();
			if (userNum == 0) break;
			
			else if (userNum > comNumber) {
				System.out.println ("당신이 생각한 숫자가 너무 큽니다.");
			}
			else if (userNum < comNumber) {
				System.out.println ("당신이 생각한 숫자가 너무 작습니다.");
			}
			else {
				System.out.println (count + "번 만에 맞추셨네요, 게임을 종료합니다.");
				break;
		}
		
	}
	}
}
