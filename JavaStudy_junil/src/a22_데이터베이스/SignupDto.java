package a22_데이터베이스;

import lombok.Data;

@Data
public class SignupDto {
	private String username;
	private String password;
	private String name;
	private String email;
}
