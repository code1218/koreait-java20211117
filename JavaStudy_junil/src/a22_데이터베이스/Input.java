package a22_데이터베이스;

import java.util.Scanner;

public class Input {
	private Scanner scanner;
	
	public Input() {
		scanner = new Scanner(System.in);
	}
	
	public String cmdInput() {
		System.out.print("명령을 입력하세요: ");
		return scanner.nextLine();
		
	}
	
	public void cmdErrorMessage() {
		System.out.println("잘못된 명령입니다.");
		System.out.println();
	}
	
	public SignupDto signupInput() {
		SignupDto signupDto = new SignupDto();
		
		return signupDto;
	}
}
