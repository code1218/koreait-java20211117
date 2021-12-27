package a22_데이터베이스.view;

import java.util.Scanner;

import a22_데이터베이스.domain.user.UserDao;
import a22_데이터베이스.domain.user.UserDaoImpl;
import a22_데이터베이스.dto.SigninDto;
import a22_데이터베이스.dto.SignupDto;
import a22_데이터베이스.service.AuthService;

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
	
	public String checkUsername(AuthService authService) {
		String username = null;
		while(true) {
			username = input();
			int result = authService.checkUsername(username);
			if(result == 0) {
				break;
			}else {
				System.out.println("이미 존재하는 아이디입니다.");
			}
		}
		return username;
	}
	
	public boolean isEmpty(String data) {
		if(data.equals("") || data == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public String input() {
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
	
	public SignupDto signupInsert(AuthService authService) {
		System.out.print("아이디: ");
		String username = checkUsername(authService);
		System.out.print("비밀번호: ");
		String password = input();
		System.out.print("이름: ");
		String name = input();
		System.out.print("이메일: ");
		String email = input();
		
		SignupDto signupDto = new SignupDto(username, password, name, email);
		return signupDto;
	}
	
	public SigninDto signinInsert() {
		System.out.print("아이디: ");
		String username = input();
		System.out.println("비밀번호: ");
		String password = input();
		
		SigninDto signinDto = new SigninDto(username, password);
		return signinDto;
	}
}
