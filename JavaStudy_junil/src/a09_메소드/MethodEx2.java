package a09_메소드;

import java.util.Scanner;

public class MethodEx2 {
	static Scanner in = new Scanner(System.in);
	
	static void mainMenu() {
		boolean loopFlag = true;
		
		String select = null;
		
		while(loopFlag) {
			System.out.println("[프로그램 메뉴]");
			System.out.println("1. 김준일 강사 폴더");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");
			select = in.nextLine(); //문자열 입력
			
			if(select.equals("1")) {
				loopFlag = junilFolder();
			} else if(select.equals("q")) {
				System.out.println("프로그램 종료 중...");
				loopFlag = false;
			} else {
				System.out.println("실행할 수 없는 명령입니다.");
			}
		}
	}
	
	static boolean junilFolder() {
		boolean loopFlag = true;
		boolean loopFlag2 = true;
		
		String select = null;
		
		while(loopFlag2) {
			System.out.println("[1. 김준일 강사 폴더]");
			System.out.println("1. javaStudy 폴더");
			System.out.println("b. 뒤로가기");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");
			select = in.nextLine(); //문자열 입력
			
			if(select.equals("1")) {
				System.out.println("1. javaStudy 폴더 open");
			}else if(select.equals("b")) {
				//이전 페이지로 이동
				System.out.println("뒤로가기 실행");
				loopFlag2 = false;
			}else if(select.equals("q")) {
				//프로그램 종료
				System.out.println("프로그램 종료 중...");
				loopFlag = false;
				loopFlag2 = false;
			}
		}
		return loopFlag;
	}
	
	
	public static void main(String[] args) {
		mainMenu();
		System.out.println("프로그램 종료.");

	}

}
