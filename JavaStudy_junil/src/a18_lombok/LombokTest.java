package a18_lombok;

public class LombokTest {

	public static void main(String[] args) {
		User user = new User();
		User user2 = new User("junil","1234","������","skjil1218@gmail.com");
		
		user.setUsername("junil1234");
		
		user.equals(user2);
		System.out.println("�ؽ��ڵ�: " + user.hashCode());
		
		System.out.println(user.getUsername());
		
		System.out.println(user);
		System.out.println(user2);
	}

}