package a07_조건;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result = 0;
		int round = 1;
		
		switch(round) {
			case 1: 
				System.out.println("1라운드 시작");
				System.out.print("게임 결과 입력(승리=1, 패배=2): ");
				result = input.nextInt();
				if(result == 2) {
					System.out.println("게임 패배");
					break;
				}
			case 2: 
				System.out.println("2라운드 시작");
				System.out.print("게임 결과 입력(승리=1, 패배=2): ");
				result = input.nextInt();
				if(result == 2) {
					System.out.println("게임 패배");
					break;
				}
			case 3: 
				System.out.println("3라운드 시작");
				System.out.print("게임 결과 입력(승리=1, 패배=2): ");
				result = input.nextInt();
				if(result == 2) {
					System.out.println("게임 패배");
					break;
				}
			case 4: 
				System.out.println("4라운드 시작");
				System.out.print("게임 결과 입력(승리=1, 패배=2): ");
				result = input.nextInt();
				if(result == 2) {
					System.out.println("게임 패배");
					break;
				}
				System.out.println("모든 라운드에서 승리하셨습니다.");
		}

	}

}
