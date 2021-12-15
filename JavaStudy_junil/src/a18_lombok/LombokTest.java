package a18_lombok;

public class LombokTest {

	public static void main(String[] args) {
		User user = new User();
		User user2 = new User("junil","1234","김준일","skjil1218@gmail.com");
		
		user.setUsername("junil1234");
		
		user.equals(user2);
		System.out.println("해쉬코드: " + user.hashCode());
		
		System.out.println(user.getUsername());
		
		System.out.println(user);
		System.out.println(user2);
	}

}
