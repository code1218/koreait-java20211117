package a20_ÄÃ·º¼Ç;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("±èÁØÀÏ");
		arrayList.add("±èÁØÀÌ");
		arrayList.add("±èÁØ»ï");
		arrayList.add("±èÁØ»ç");
		arrayList.add("±èÁØ¿À");
		arrayList.add("±èÁØÀ°");
		
		System.out.println(arrayList.get(2));
		System.out.println(arrayList);
		
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);
		
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);

	}

}
