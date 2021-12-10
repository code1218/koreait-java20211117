package a15_인터페이스;

public class RemoteControlTest {

	public static void main(String[] args) {
		LGRemoteControl lgRemoteControl = new LGRemoteControl();
		
		lgRemoteControl.powerButtonController();
		lgRemoteControl.volumeButtonController(1);
		lgRemoteControl.volumeButtonController(2);
		lgRemoteControl.powerButtonController();
	}

}
