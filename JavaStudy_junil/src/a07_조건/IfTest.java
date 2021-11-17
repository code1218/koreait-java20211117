package a07_조건;

public class IfTest {

	public static void main(String[] args) {
		int number = 8;
		
		if(number == 10) {
			System.out.println("number가 10입니다.");
		}
		else if(number == 9) {
			System.out.println("number가 9입니다.");
		}
		else if(number == 8) {
			System.out.println("number가 8입니다.");
		}
		else {
			System.out.println("number가 7입니다.");
		}
		
		System.out.println("항상실행");
	}

}
