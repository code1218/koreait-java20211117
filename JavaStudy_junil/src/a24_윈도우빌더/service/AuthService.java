package a24_孺紫辦網渦.service;

import a24_孺紫辦網渦.domain.user.User;
import a24_孺紫辦網渦.domain.user.UserDao;
import a24_孺紫辦網渦.domain.user.UserDaoImpl;
import a24_孺紫辦網渦.swing.dto.SigninDto;

public class AuthService {
	
	private UserDao userDao;
	
	public AuthService() {
		userDao = new UserDaoImpl();
	}
	
	public int signin(SigninDto signinDto) {
		User userEntity = signinDto.toEntity();
		return userDao.signinByUsernameAndPassword(userEntity);
	}
}
