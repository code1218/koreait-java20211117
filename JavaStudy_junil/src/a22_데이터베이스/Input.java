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
	
	public boolean isEmpty(String data) {
		if(data.equals("") || data == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public String signupInput() {
		String data = null;
		while(true) {
			data = scanner.nextLine();
			if(!isEmpty(data)) {
				break;
			}
			System.out.println("빈 값을 입력할 수 없습니다.");
		}
		return data;
	}
	
	public SignupDto signupInsert() {
		System.out.print("아이디: ");
		String username = signupInput();
		System.out.print("비밀번호: ");
		String password = signupInput();
		System.out.print("이름: ");
		String name = signupInput();
		System.out.print("이메일: ");
		String email = signupInput();
		
		SignupDto signupDto = new SignupDto(username, password, name, email);
		return signupDto;
	}
}
