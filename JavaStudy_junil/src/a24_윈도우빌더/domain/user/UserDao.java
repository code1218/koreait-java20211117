package a24_À©µµ¿ìºô´õ.domain.user;

public interface UserDao {
	public int insertUser(User user);
	public int checkUsernameByUsername(String username);
	public int signinByUsernameAndPassword(User user);
	public User getUserByUsername(String username); 
}
