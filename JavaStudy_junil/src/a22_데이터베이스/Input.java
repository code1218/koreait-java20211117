package a22_�����ͺ��̽�;

import java.util.Scanner;

public class Input {
	private Scanner scanner;
	
	public Input() {
		scanner = new Scanner(System.in);
	}
	
	public String cmdInput() {
		System.out.print("����� �Է��ϼ���: ");
		return scanner.nextLine();
		
	}
	
	public void cmdErrorMessage() {
		System.out.println("�߸��� ����Դϴ�.");
		System.out.println();
	}
	
	public SignupDto signupInput() {
		SignupDto signupDto = new SignupDto();
		
		return signupDto;
	}
}
