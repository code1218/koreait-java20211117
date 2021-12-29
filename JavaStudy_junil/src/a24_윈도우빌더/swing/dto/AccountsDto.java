package a24_孺紫辦網渦.swing.dto;

import a24_孺紫辦網渦.domain.user.User;
import lombok.Data;

@Data
public class AccountsDto {
	private String name;
	private String email;
	private String password;
	
	public User toEntity(int id) {
		return User.builder()
				.id(id)
				.password(password)
				.name(name)
				.email(email)
				.build();
	}
}
