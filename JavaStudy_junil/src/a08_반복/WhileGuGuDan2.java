package a08_반복;

import java.util.Scanner;

public class WhileGuGuDan2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int gugudanStart = 0;
		int gugudanEnd = 0;
		
		System.out.print("시작 단수: ");
		gugudanStart = in.nextInt();
		System.out.print("마지막 단수: ");
		gugudanEnd = in.nextInt();
		
		int dan = gugudanStart;
		
		while(dan < gugudanEnd+1) {
			/*
			 * if(dan%2 == 0) { dan++; continue; }
			 */
			System.out.println(dan + "단");
			int j = 1;
			while(j < 10) {
				System.out.println(dan + " X " + j + " = " + dan*j);
				j++;
			}
			System.out.println();
			dan++;
		}

	}

}
