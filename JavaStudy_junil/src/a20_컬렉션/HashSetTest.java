package a20_ƒ√∑∫º«;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<User> userSet = new HashSet<User>();
		
		userSet.add(new User("junil1", "1234", "±Ë¡ÿ¿œ1", "skjil1218@gmail.com"));
		userSet.add(new User("junil2", "1234", "±Ë¡ÿ¿œ2", "skjil1218@gmail.com"));
		userSet.add(new User("junil3", "1234", "±Ë¡ÿ¿œ3", "skjil1218@gmail.com"));
		userSet.add(new User("junil4", "1234", "±Ë¡ÿ¿œ4", "skjil1218@gmail.com"));
		userSet.add(new User("junil5", "1234", "±Ë¡ÿ¿œ5", "skjil1218@gmail.com"));
		userSet.add(new User("junil6", "1234", "±Ë¡ÿ¿œ6", "skjil1218@gmail.com"));
		
		Iterator<User> ir = userSet.iterator();
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
		System.out.println(userSet);
		
		
		Set<String> strSet = new HashSet<String>();
		strSet.add("±Ë¡ÿ¿œ");
		strSet.add("±Ë¡ÿ¿œ");
		strSet.add("±Ë¡ÿ¿œ");
		strSet.add("±Ë¡ÿ¿œ");
		strSet.add("±Ë¡ÿ¿œ");
		strSet.add("±Ë¡ÿ¿œ");
		
		System.out.println(strSet);
		System.out.println(strSet.size());

	}

}
