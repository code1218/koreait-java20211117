package a24_���������.service;

import a24_���������.domain.user.User;
import a24_���������.domain.user.UserDao;
import a24_���������.domain.user.UserDaoImpl;
import a24_���������.session.Principal;
import a24_���������.swing.dto.SigninDto;
import a24_���������.swing.dto.SignupDto;

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
	
	public boolean usernameCheck(String username) {
		int result = userDao.checkUsernameByUsername(username);
		if(result == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean signup(SignupDto signupDto) {
		User userEntity = signupDto.toEntity();
		int result = userDao.insertUser(userEntity);
		if(result == 1) {
			return true;
		}else {
			return false;
		}
	}
}
