package a08_반복;

public class WhileGuGuDan {

	public static void main(String[] args) {
		//구구단 2단
		int dan = 2;
		int number = 1;
		
		while(number < 10) {
			System.out.println(dan + " X " + number + " = " + dan*number);
			number++;
		}

	}

}
