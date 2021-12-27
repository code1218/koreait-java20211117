package a24_À©µµ¿ìºô´õ.domain.user;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private int id;
	private String username;
	private String password;
	private String name;
	private String email;
	private Date create_date;
	private Date update_date;
}
