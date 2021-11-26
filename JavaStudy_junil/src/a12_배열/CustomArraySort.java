package a12_배열;

/**
 * 
 * sort(정렬)
 *
 */

public class CustomArraySort {

	public static void main(String[] args) {
		//int[] number = new int[10];
		int[] number = {10, 20, 0, 40, 0 , 50, 30, 0, 0};
		
		for(int i = 0; i < number.length; i++) {
			if(number[i] == 0) {
				for(int j = i; j < number.length; j++) {
					if(j == number.length - 1) {
						number[j] = 0;
						break;
					}else {
						number[j] = number[j + 1];
					}
				}
			}
		}
		
		for(int num : number) {
			System.out.println(num);
		}
	}

}
