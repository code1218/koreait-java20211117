package a16_�⺻Ŭ����;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�̸��Է�: ");
		String name = in.nextLine();
		
		String name1 = "������";
		String name2 = "������";
		String name3 = new String("������");
		
		System.out.println(name1 == "������");
		System.out.println(name.equals("������"));
		System.out.println(name3);
		
	}
}
