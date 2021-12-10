package a15_인터페이스2;

import java.util.Scanner;

public class UserServiceImpl implements UserService{
	private User[] users;
	private Scanner in;
	
	public UserServiceImpl(int userCount) {
		in = new Scanner(System.in);
		users = new User[userCount];
	}
	
	@Override
	public void createUser() {
		boolean loopFlag = true;
		
		while(loopFlag) {
			System.out.print("아이디: ");
			String id = in.nextLine();
			System.out.print("비밀번호: ");
			String password = in.nextLine();
			System.out.print("이름: ");
			String name = in.nextLine();
			System.out.print("이메일: ");
			String email = in.nextLine();
			
			do {
				System.out.print("계속 정보를 등록하시겠습니까?(y/n)");
				String continueFlag = in.nextLine();
				if(continueFlag.equals("n") || continueFlag.equals("N")) {
					loopFlag = false;
					break;
				}else if(continueFlag.equals("y") || continueFlag.equals("Y")) {
					loopFlag = true;
					break;
				}else {
					System.out.println("잘못된 명령입니다.");
				}
			}while(true);
			
			User user = new User();
			user.setId(id);
			user.setPassword(password);
			user.setName(name);
			user.setEmail(email);
			
			insertUser(user);
			
		}
		
	}

	@Override
	public void insertUser(User user) {
		int index = 0;
		
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				index = i;
				break;
			}
		}
		users[index] = user;
	}
	
	@Override
	public User getUser(String id) {
		for(int i = 0; i< users.length; i++) {
			if(users[i] == null || !users[i].getId().equals(id)) {
				continue;
			}
			return users[i];
		}
		
		return null;
	}

	@Override
	public void printUsers() {
		for(User user : users) {
			if(user == null) {
				continue;
			}
			System.out.println(user);
		}
	}

	@Override
	public void searchUser() {
		System.out.println("사용자 정보 검색");
		System.out.print("찾고자하는 아이디 입력: ");
		String searchId = in.nextLine();
		
		User user = getUser(searchId);
		
		if(user == null) {
			System.out.println("해당 아이디의 사용자를 찾을 수 없습니다.");
		}else {
			System.out.println("찾은 사용자 정보");
			System.out.println(user);
		}
		
	}

	
	
}
