package a15_인터페이스;

public class LGRemoteControl {
	private Button powerButton = new PowerButton();
	private Button volumeUpButton = new VolumeUp();
	private Button volumeDownButton = new VolumeDown();
	
	private boolean powerStatus = false;
	
	public LGRemoteControl() {
		
	}
	
	public void powerButtonController() {
		powerButton.누름();
		if(powerStatus == false) {
			System.out.println("전원을 켭니다.");
			powerStatus = true;
		}else {
			System.out.println("전원을 끕니다.");
			powerStatus = false;
		}
	}
	
	public void volumeButtonController(int flag) {
		if(flag == 1) {
			//볼륨업
			volumeUpButton.누름();
		}else if(flag == 2){
			//볼륨다운
			volumeDownButton.누름();
		}else {
			System.out.println("잘못된 신호입니다.");
		}
	}
}
