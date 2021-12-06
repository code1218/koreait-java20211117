package a14_추상;

class 위쪽방향 extends KeyPress {
	@Override
	public void keyUp() {
		System.out.println("위쪽 방향을 누르셨습니다.");
	}
}

public class KeyTest {

	public static void main(String[] args) {
		위쪽방향 위 = new 위쪽방향();
		위.keyUp();
	}

}
