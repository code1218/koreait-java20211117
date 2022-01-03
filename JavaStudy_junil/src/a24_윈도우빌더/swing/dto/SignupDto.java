package a24_孺紫辦網渦.swing.dto;

import a24_孺紫辦網渦.domain.user.User;
import lombok.Data;

@Data
public class SignupDto {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
	}
}
