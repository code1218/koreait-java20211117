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
	
	public boolean isEmpty(String data) {
		if(data.equals("") || data == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public String signupInput() {
		String data = null;
		while(true) {
			data = scanner.nextLine();
			if(!isEmpty(data)) {
				break;
			}
			System.out.println("�� ���� �Է��� �� �����ϴ�.");
		}
		return data;
	}
	
	public SignupDto signupInsert() {
		System.out.print("���̵�: ");
		String username = signupInput();
		System.out.print("��й�ȣ: ");
		String password = signupInput();
		System.out.print("�̸�: ");
		String name = signupInput();
		System.out.print("�̸���: ");
		String email = signupInput();
		
		SignupDto signupDto = new SignupDto(username, password, name, email);
		return signupDto;
	}
}
