package ch02;

import java.util.Scanner;



public class ScannerEx {

	public static void main(String[] args) {


		Scanner in = new  Scanner(System.in);
		System.out.println("첫번째 정수값을 입력하세요 :");	
		int x = in.nextInt(); 
		System.out.println("두번째 정수 값을 입력하세요 :");

		int y = in.nextInt(); 
		System.out.printf("%d * %d는 %d입니다. .\n", x, y, x*y);
		in.close(); 
          
	}  

}
