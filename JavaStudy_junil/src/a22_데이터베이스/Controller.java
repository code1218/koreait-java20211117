package a22_데이터베이스;

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
			System.out.println("프로그램 종료중...");
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
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
	}
}
