package a12_¹è¿­;

public class ForEach {

	public static void main(String[] args) {
		int[] numArray = new int[50];
		
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = 10;
		}
		
		for(int num : numArray) {
			System.out.println(num);
		}

	}

}
