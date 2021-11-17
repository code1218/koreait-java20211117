package a06_표준입력;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		int number2 = input.nextInt();
		String name = input.next();
		input.nextLine();
		String phone = input.nextLine();
		String addr = input.nextLine();
		
		System.out.println(number2);
		System.out.println(number);
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(addr);
	}

}
