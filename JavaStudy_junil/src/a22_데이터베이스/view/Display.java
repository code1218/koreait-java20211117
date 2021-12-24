package a22_데이터베이스.view;

import a22_데이터베이스.session.Principal;

public class Display {
	private Principal principal;
	
	public Display() {
		principal = Principal.getInstance();
	}
	
	public void mainDisplay() {
		System.out.println("[프로그램 시작]");
		if(principal.getLoginUser() != null) {
			System.out.println(principal.getLoginUser().getName() + "님 환영합니다.");
		}
		System.out.println("1. 회원가입");
		if(principal.getLoginUser() == null) {
			System.out.println("2. 로그인");
		}else {
			System.out.println("2. 로그아웃");
		}
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}
	
	public void signupDisplay() {
		System.out.println("[회원가입]");
	}
	
	public void signupMessage(boolean result) {
		if(result == true) {
			System.out.println("회원가입 성공.");
		}else {
			System.out.println("회원가입 실패.");
		}
	}
	
	public void signinDisplay() {
		System.out.println("[로그인]");
	}
	
	public void signinMessage(int result) {
		if(result == 0) {
			System.out.println("존재하지 않는 아이디 입니다.");
		}else if(result == 1) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}else if(result == 2) {
			System.out.println("로그인 성공.");
		}
	}
}
