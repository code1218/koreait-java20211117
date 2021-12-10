package a15_인터페이스2;

public interface UserService {
	public void createUser();
	public void insertUser(User user);
	public User getUser(String id);
	public void printUsers();
	public void searchUser();
}
