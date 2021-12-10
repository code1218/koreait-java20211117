package a16_기본클래스;

// 기본클래스란 JRE 라이브러리에서 제공하는 클래스들

public class ObjectEx{
	
	@Override
	public String toString() {
		return "안녕하세요. toString입니다.";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public static void main(String[] args) {
		ObjectEx objEx = new ObjectEx();
		String str = new String();
		System.out.println(str);
		System.out.println(objEx);
		System.out.println(objEx.hashCode());
		System.out.println(objEx.equals(objEx));
	}
}
