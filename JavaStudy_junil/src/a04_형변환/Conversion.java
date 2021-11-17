package a04_형변환;

public class Conversion {

	/**
	 * 
	 * 형변환
	 * 1. 업캐스팅(묵시적형변환 <선택>)
	 * 문자 -> 정수 -> 실수
	 * 
	 * 2. 다운캐스팅(명시적형변환 <필수>)
	 * 실수 -> 정수 -> 문자
	 */
	public static void main(String[] args) {
		//1. 문자 -> 정수
		char c = 'A';
		int i_c = (int)c;
		
		//2. 정수 -> 실수
		int i = 10;
		double d_i = (double)i;
		
		//3. 실수 -> 정수
		double d = 3.14;
		int i_d = (int)d;
		
		//4. 정수 -> 문자
		int ii = 65;
		char c_ii = (char)ii;
		
		int number = (int)(10.5 * 2);
		double number2 = 10.5 * 2;
	}

}
