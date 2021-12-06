package a15_인터페이스;

public class PowerButton implements Button{

	@Override
	public void 누름() {
		System.out.println("전원을 켠다.");
	}

}
