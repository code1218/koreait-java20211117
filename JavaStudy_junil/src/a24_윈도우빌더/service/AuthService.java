package a24_孺紫辦網渦.service;

import a24_孺紫辦網渦.domain.user.User;
import a24_孺紫辦網渦.domain.user.UserDao;
import a24_孺紫辦網渦.domain.user.UserDaoImpl;
import a24_孺紫辦網渦.session.Principal;
import a24_孺紫辦網渦.swing.dto.SigninDto;

public class AuthService {
	
	private UserDao userDao;
	
	private Principal principal;
	
	public AuthService() {
		userDao = new UserDaoImpl();
		principal = Principal.getInstance();
	}
	
	public int signin(SigninDto signinDto) {
		User userEntity = signinDto.toEntity();
		int result = userDao.signinByUsernameAndPassword(userEntity);
		if(result == 2) {
			userEntity = userDao.getUserByUsername(signinDto.getUsername());
			principal.setUser(userEntity);
		}
		return result;
	}
}
