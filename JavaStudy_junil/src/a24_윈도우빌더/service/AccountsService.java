package a24_孺紫辦網渦.service;

import a24_孺紫辦網渦.domain.user.User;
import a24_孺紫辦網渦.domain.user.UserDao;
import a24_孺紫辦網渦.domain.user.UserDaoImpl;
import a24_孺紫辦網渦.session.Principal;
import a24_孺紫辦網渦.swing.dto.AccountsDto;

public class AccountsService {
	private UserDao userDao;
	private Principal principal;
	
	public AccountsService() {
		userDao = new UserDaoImpl();
		principal = Principal.getInstance();
	}
	
	public boolean updateProfile(AccountsDto accountsDto) {
		User userEntity = accountsDto.toEntity(principal.getUser().getId()); 
		int result = userDao.updateProfileById(userEntity);
		if(result == 0) {
			return false;
		}else {
			principal.getUser().setName(accountsDto.getName());
			principal.getUser().setEmail(accountsDto.getEmail());
			return true;
		}
	}
	
	public boolean updatePassword(String password) {
		User userEntity = new User(principal.getUser().getId(), null, password, null, null, null, null);
		int result = userDao.updatePasswordById(userEntity);
		if(result == 0) {
			return false;
		}else {
			principal.getUser().setPassword(password);
			return true;
		}
	}
}
