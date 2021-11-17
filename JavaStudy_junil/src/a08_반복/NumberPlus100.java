package a08_¹İº¹;

public class NumberPlus100 {
	public static void main(String[] args) {
		int number = 1;
		int result = 0;
		
		/*
		result += number++;
		result += number++;
		result += number++;
		result += number++;
		result += number++;
		result += number++;
		result += number++;
		*/
		
		for(int i = 0; i < 100; i++) {
			result += number++;
		}
		
		
		System.out.println(result);
		
	}
}
