package a20_�÷���;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserArrayList {
	private Scanner in;
	private List<User> users;
	
	public UserArrayList() {
		in = new Scanner(System.in);
		users = new ArrayList<User>();
	}
	
	public User deleteUserByUsername(String username) {
		for(int i = 0; i < users.size(); i++) {
			
		}
	}
	
	public User getUserByUsername(String username) {
		for(User user : users) {
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
	
	public void getUserAll() {
		System.out.println(users);
	}
	
	public void selectUser() {
		while(true) {
			System.out.println("[ ����� ��ȸ]");
			System.out.println("1. ���̵�� ã��");
			System.out.println("2. ��ü��ȸ");
			System.out.println("b. �ڷΰ���");
			System.out.print("����� ������ �ּ���: ");
			String select = in.nextLine();
			
			if(select.equals("1")) {
				System.out.println("[ ���̵�� ����� ���� ��ȸ ]");
				System.out.print("ã���� ����� ���̵� �Է��� �ּ���: ");
				String username = in.nextLine();
				User user = getUserByUsername(username);
				if(user == null) {
					System.out.println("�ش� ���̵� ����ϴ� ����ڸ� ã�� �� �����ϴ�.");
				}else {
					System.out.println(user);
				}
				
			}else if(select.equals("2")) {
				getUserAll();
			}else if(select.equals("b")) {
				break;
			}else {
				System.out.println("����� �� ���� ����Դϴ�.\n");
			}
		}
	}
	
	public User insertUser() {
		User user = new User();
		System.out.println("[ ����� �߰� ]");
		
		System.out.print("���̵�: ");
		user.setUsername(in.nextLine());
		System.out.print("��й�ȣ: ");
		user.setPassword(in.nextLine());
		System.out.print("�̸�: ");
		user.setName(in.nextLine());
		System.out.print("�̸���: ");
		user.setEmail(in.nextLine());
		
		System.out.println("[ ����� �Է��� �Ϸ�Ǿ����ϴ�. ]\n");
		return user;
	}
	
	public void desplayController() {
		while(true) {
			System.out.println("1. ����� �Է�");
			System.out.println("2. ����� ��ȸ");
			System.out.println("3. ����� ����");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� ������ �ּ���: ");
			String cmd = in.nextLine();
			
			if(cmd.equals("1")) {
				users.add(insertUser());
			}else if(cmd.equals("2")) {
				selectUser();
			}else if(cmd.equals("3")) {
				
			}else if(cmd.equals("q")) {
				System.out.println("���α׷� ������...\n");
				break;
			}else {
				System.out.println("����� �� ���� ����Դϴ�.\n");
			}
		}
	}

	public static void main(String[] args) {
		UserArrayList ual = new UserArrayList();
		
		ual.desplayController();
		
		System.out.println("���α׷� ����.");
		
	}
	
}
