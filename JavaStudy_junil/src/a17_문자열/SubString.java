package a17_문자열;

/**
 * 
 * subString(startIndex, endIndex) 메소드
 * startIndex부터 endIndex전까지 문자열을 잘라주는 메소드이다.
 * 
 * indexOf(문자열) 메소드
 * 해당 문자열의 index 위치를 찾아준다.
 * 
 */

public class SubString {
	public static void main(String[] args) {
		String str = "안녕하세요. 반갑습니다.";
		System.out.println(str.substring(0, 6));
		
		String data = "# 안녕하세요. 반갑습니다.";
		int index = data.indexOf(" ");
		String cmd = data.substring(0, index);
		data = data.substring(index + 1);
		System.out.println("cmd: " + cmd);
		System.out.println("data: " + data);
		
		index = data.indexOf(" ");
		cmd = data.substring(0, index);
		data = data.substring(index + 1);
		System.out.println("cmd: " + cmd);
		System.out.println("data: " + data);
		
		String number = "123456789";
		String result = number.substring(0, number.length());
		System.out.println(result);
		
		int size = number.length();
		for(int i = 0; i < size; i++) {
			result = number.substring(0, 1);
			number = number.substring(1);
			System.out.println(result);
		}
		
		
	}
}
