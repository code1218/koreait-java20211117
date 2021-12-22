package a21_static;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
class User {
	private static int autoId;
	private int id = 20210000;
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User() {
		id += (++autoId);
	}
	
	public User(String username, String password, String name, String email) {
		super();
		id += (++autoId);
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
}

public class StaticText {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		User user1 = new User("junil", "1234", "±Ë¡ÿ¿œ", "skjil1218gmail.com");
		User user2 = new User("junil", "1234", "±Ë¡ÿ¿œ", "skjil1218gmail.com");
		User user3 = new User("junil", "1234", "±Ë¡ÿ¿œ", "skjil1218gmail.com");
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		System.out.println(userList);
		
	}

}
