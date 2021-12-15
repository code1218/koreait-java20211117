package a20_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserArrayList {
	private Scanner in;
	private List<User> users;
	
	public UserArrayList() {
		in = new Scanner(System.in);
		users = new ArrayList<User>();
	}
	
	public User deleteUserByUsername(String username) {
		for(int i = 0; i < users.size(); i++) {
			
		}
	}
	
	public User getUserByUsername(String username) {
		for(User user : users) {
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
	
	public void getUserAll() {
		System.out.println(users);
	}
	
	public void selectUser() {
		while(true) {
			System.out.println("[ 사용자 조회]");
			System.out.println("1. 아이디로 찾기");
			System.out.println("2. 전체조회");
			System.out.println("b. 뒤로가기");
			System.out.print("명령을 선택해 주세요: ");
			String select = in.nextLine();
			
			if(select.equals("1")) {
				System.out.println("[ 아이디로 사용자 정보 조회 ]");
				System.out.print("찾으실 사용자 아이디를 입력해 주세요: ");
				String username = in.nextLine();
				User user = getUserByUsername(username);
				if(user == null) {
					System.out.println("해당 아이디를 사용하는 사용자를 찾을 수 없습니다.");
				}else {
					System.out.println(user);
				}
				
			}else if(select.equals("2")) {
				getUserAll();
			}else if(select.equals("b")) {
				break;
			}else {
				System.out.println("사용할 수 없는 명령입니다.\n");
			}
		}
	}
	
	public User insertUser() {
		User user = new User();
		System.out.println("[ 사용자 추가 ]");
		
		System.out.print("아이디: ");
		user.setUsername(in.nextLine());
		System.out.print("비밀번호: ");
		user.setPassword(in.nextLine());
		System.out.print("이름: ");
		user.setName(in.nextLine());
		System.out.print("이메일: ");
		user.setEmail(in.nextLine());
		
		System.out.println("[ 사용자 입력이 완료되었습니다. ]\n");
		return user;
	}
	
	public void desplayController() {
		while(true) {
			System.out.println("1. 사용자 입력");
			System.out.println("2. 사용자 조회");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 선택해 주세요: ");
			String cmd = in.nextLine();
			
			if(cmd.equals("1")) {
				users.add(insertUser());
			}else if(cmd.equals("2")) {
				selectUser();
			}else if(cmd.equals("3")) {
				
			}else if(cmd.equals("q")) {
				System.out.println("프로그램 종료중...\n");
				break;
			}else {
				System.out.println("사용할 수 없는 명령입니다.\n");
			}
		}
	}

	public static void main(String[] args) {
		UserArrayList ual = new UserArrayList();
		
		ual.desplayController();
		
		System.out.println("프로그램 종료.");
		
	}
	
}
