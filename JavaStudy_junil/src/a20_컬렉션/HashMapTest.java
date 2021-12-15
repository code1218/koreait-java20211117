package a20_ÄÃ·º¼Ç;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, User> userMap = new HashMap<String, User>();
		
		userMap.put("junil1", new User("junil", "1234", "±èÁØÀÏ", "skjil1218@gmail.com"));
		userMap.put("junil2", new User("junil", "1234", "±èÁØÀÏ", "skjil1218@gmail.com"));
		userMap.put("junil3", new User("junil", "1234", "±èÁØÀÏ", "skjil1218@gmail.com"));
		userMap.put("junil4", new User("junil", "1234", "±èÁØÀÏ", "skjil1218@gmail.com"));
		userMap.put("junil5", new User("junil", "1234", "±èÁØÀÏ", "skjil1218@gmail.com"));
		userMap.put("junil1", new User("junil2", "4321", "±èÁØÀÏ2", "skjil1218@gmail.com"));
		userMap.replace("junil5", new User("junil3", "1234333", "±èÁØÀÏ3", "skjil1218@gmail.com"));
		
		String username = "junil2";
		
		Set<String> keySet = userMap.keySet();
		System.out.println(keySet);
		Iterator<String> ir = keySet.iterator();
		while(ir.hasNext()) {
			User user = userMap.get(ir.next());
			
			if(user.getUsername().equals(username)) {
				System.out.println(user);
			}
		}
		System.out.println(userMap);
		

	}

}
