package a03_상수;

public class Constant {

	public static void main(String[] args) {
		int studentYear = 4;
		studentYear = 10;
		final int STUDENT_YEAR = 4;
		//STUDENT_YEAR = 5; 상수는 값을 변경할 수 없다.
		System.out.println(studentYear);
		System.out.println(STUDENT_YEAR);

	}

}
