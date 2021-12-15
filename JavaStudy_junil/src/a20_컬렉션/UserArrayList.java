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
			if(users.get(i).getUsername().equals(username)) {
				return users.remove(i);
			}
		}
		return null;
	}
	
	public void deleteUserAll() {
		users.clear();
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
	
	public void updatePassword(User user) {
		System.out.print("변경하실 비밀번호를 입력해 주세요: ");
		user.setPassword(in.nextLine());
		System.out.println("비밀번호 변경이 완료되었습니다.\n");
	}
	
	public void updateName(User user) {
		System.out.print("변경하실 이름을 입력해 주세요: ");
		user.setName(in.nextLine());
		System.out.println("이름을 변경이 완료되었습니다.\n");
	}
	
	public void updateEmail(User user) {
		System.out.print("변경하실 이메일을 입력해 주세요: ");
		user.setEmail(in.nextLine());
		System.out.println("이메일 변경이 완료되었습니다.\n");
	}
	
	public void updateUserDtl(User user) {
		while(true) {
			System.out.println("[" + user.getName() + " 사용자 정보 수정]");
			System.out.println("1. 비밀번호 변경");
			System.out.println("2. 이름 변경");
			System.out.println("3. 이메일 변경");
			System.out.println("b. 뒤로가기");
			System.out.print("명령을 선택해 주세요: ");
			String select = in.nextLine();
			
			if(select.equals("1")) {
				updatePassword(user);
			}else if(select.equals("2")) {
				updateName(user);
			}else if(select.equals("3")) {
				updateEmail(user);
			}else if(select.equals("b")) {
				break;
			}else {
				System.out.println("사용할 수 없는 명령입니다.\n");
			}
		}
	}
	
	public void updateUser() {
		System.out.println("[ 사용자 수정 ]");
		System.out.println("수정할 사용자의 아이디를 입력해 주세요: ");
		String username = in.nextLine();
		updateUserDtl(getUserByUsername(username));
	}
	
	public void deleteUser() {
		while(true) {
			System.out.println("[ 사용자 삭제]");
			System.out.println("1. 아이디로 삭제");
			System.out.println("2. 전체삭제");
			System.out.println("b. 뒤로가기");
			System.out.print("명령을 선택해 주세요: ");
			String select = in.nextLine();
			
			if(select.equals("1")) {
				System.out.println("[ 아이디로 사용자 정보 삭제 ]");
				System.out.print("삭제하실 사용자 아이디를 입력해 주세요: ");
				String username = in.nextLine();
				User user = deleteUserByUsername(username);
				if(user == null) {
					System.out.println("해당 아이디를 사용하는 사용자를 찾을 수 없습니다.");
				}else {
					System.out.println(user);
					System.out.println("사용자를 삭제하였습니다.");
				}
				
			}else if(select.equals("2")) {
				deleteUserAll();
			}else if(select.equals("b")) {
				break;
			}else {
				System.out.println("사용할 수 없는 명령입니다.\n");
			}
		}
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
			System.out.println("4. 사용자 수정");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 선택해 주세요: ");
			String cmd = in.nextLine();
			
			if(cmd.equals("1")) {
				users.add(insertUser());
			}else if(cmd.equals("2")) {
				selectUser();
			}else if(cmd.equals("3")) {
				deleteUser();
			}else if(cmd.equals("4")) {
				updateUser();
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
