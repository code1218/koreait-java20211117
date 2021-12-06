package a13_상속;

public class Animal {
	private String 종류;
	private String 이름;
	
	public Animal() {
	}
	
	public Animal(String 종류, String 이름) {
		this.종류 = 종류;
		this.이름 = 이름;
	}
	
	public String get종류() {
		return 종류;
	}
	public void set종류(String 종류) {
		this.종류 = 종류;
	}
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public void move() {
		System.out.println(이름 + "(" + 종류 + ")이(가) 움직입니다.");
		System.out.println();
	}
}
