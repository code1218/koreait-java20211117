package a22_데이터베이스.service;

import a22_데이터베이스.domain.user.User;
import a22_데이터베이스.domain.user.UserDao;
import a22_데이터베이스.domain.user.UserDaoImpl;
import a22_데이터베이스.dto.SigninDto;
import a22_데이터베이스.dto.SignupDto;
import a22_데이터베이스.session.Principal;
import a22_데이터베이스.view.Input;

public class AuthService {
	private Input input;
	private UserDao userDao;
	private Principal principal;
	
	public AuthService() {
		input = new Input();
		userDao = new UserDaoImpl();
		principal = Principal.getInstance();
	}
	
	public boolean signup() {
		SignupDto signupDto = input.signupInsert();
		User userEntity = signupDto.toEntity();
		int result = userDao.insertUser(userEntity);
		if(result == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	public int signin() {
		SigninDto signinDto = input.signinInsert();
		User userEntity = signinDto.toEntity();
		int result = userDao.signinByUsernameAndPassword(userEntity);
		if(result == 2) {
			userEntity = userDao.getUserByUsername(signinDto.getUsername());
			principal.setLoginUser(userEntity);
		}
		return result;
	}
	
	public void logout() {
		principal.setLoginUser(null);
		System.out.println("로그아웃 되었습니다.");
		System.out.println();
	}
	
	public int checkUsername(String username) {
		return userDao.checkUsernameByUsername(username);
	}
}
