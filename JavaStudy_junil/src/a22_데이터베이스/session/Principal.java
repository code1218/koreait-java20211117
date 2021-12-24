package a22_데이터베이스.session;

import a22_데이터베이스.domain.user.User;
import lombok.Data;

@Data
public class Principal {
	private static Principal instance = new Principal();
	private User loginUser;
	
	private Principal() {
		
	}
	
	public static Principal getInstance() {
		if(instance == null) {
			instance = new Principal();
		}
		return instance;
	}
	
	
}
