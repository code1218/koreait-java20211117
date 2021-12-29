package a24_孺紫辦網渦.session;

import a24_孺紫辦網渦.domain.user.User;
import lombok.Data;

@Data
public class Principal {
	private static Principal instance = new Principal();
	private User user;
	
	public static Principal getInstance() {
		if(instance == null) {
			instance = new Principal();
		}
		return instance;
	}
}
