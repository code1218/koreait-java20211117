package a07_조건;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력해 주세요(0 ~ 100): ");
		int score = input.nextInt();
		
		// 90 ~ 100 A
		if(score > 100 || score < 0) {
			System.out.println("잘못된 점수 입니다.");
		}else if(89 < score) {
			System.out.println("A");
		}else if(79 < score) {
			System.out.println("B");
		}else if(69 < score) {
			System.out.println("C");
		}else if(59 < score) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		// 80 ~ 89 B
		// 70 ~ 79 C
		// 60 ~ 69 D
		// 0 ~ 59 F
		
	}

}
