package a20_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor //전체 생성자
@NoArgsConstructor //기본 생성자
@Data //getter, setter, toString, Equals, HashCode
public class User {
	private String username;
	private String password;
	private String name;
	private String email;
}
