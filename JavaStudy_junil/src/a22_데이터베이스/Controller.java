package a22_�����ͺ��̽�;

public class Controller {
	private Display display;
	private Input input;
	
	public Controller() {
		display = new Display();
		input = new Input();
	}
	
	public boolean mainMenu() {
		boolean returnFlag = false;
		
		String cmd = null;
		
		display.mainDisplay();
		cmd = input.cmdInput();
		
		if(cmd.equals("1")) {
			
		}else if(cmd.equals("2")) {
			
		}else if(cmd.equals("q")) {
			System.out.println("���α׷� ������...");
			returnFlag = true;
		}else {
			input.cmdErrorMessage();
		}
		
		return returnFlag;
	}
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		
		while(true) {
			if(controller.mainMenu()) {
				break;
			}
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		
	}
}
