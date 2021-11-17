package a08_반복;

public class DoubleLoop {

	public static void main(String[] args) {
		
		int i = 1;
		while(i < 11) {
			System.out.println(i + "번째 바퀴");
			int j = 1;
			while(j < 6) {
				System.out.println("코끼리코 " + j +"번째");
				j++;
			}
			i++;
		}
		
		//System.out.println(j); 지역변수 j는 while문 안에서만 사용 가능하다.

	}

}
