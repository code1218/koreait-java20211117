package a16_±‚∫ª≈¨∑°Ω∫;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("¿Ã∏ß¿‘∑¬: ");
		String name = in.nextLine();
		
		String name1 = "±Ë¡ÿ¿œ";
		String name2 = "±Ë¡ÿ¿œ";
		String name3 = new String("±Ë¡ÿ¿œ");
		
		System.out.println(name1 == "±Ë¡ÿ¿œ");
		System.out.println(name.equals("±Ë¡ÿ¿œ"));
		System.out.println(name3);
		
	}
}
