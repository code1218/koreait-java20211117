package a15_인터페이스2;

public class UserController {

	public static void main(String[] args) {
		int userCount = 10;
		UserService userService = new UserServiceImpl(userCount);
		userService.createUser();
		
		System.out.println("전체 유저 정보 출력 -> ");
		userService.printUsers();
		
		userService.searchUser();
		
	}
}






