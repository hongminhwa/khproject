package ch06;

import java.util.Scanner;

public class Method_Gugu {

	public static void main(String[] args) {
		int dan; 
		System.out.println("단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		gugu(dan);//호출 메소드 
		
		sc.close();
	}// 프로그램 종료 . 

 
	
	 public static void gugu(int dan) {
		   for(int i = 1; i<=9; i++) {
			   System.out.println(dan + "*" + i + "=" + dan*i);
			   
		   } // 호출한 메소드인 gugu(dan)으로 감
	}



	{  
	 
	 
	 }
 
}















//int dan = 2; 
//for(int n=1; n <=9; n++) {
//	  System.out.println(dan + "*" + n + "=" + dan*n);
//	  int sum = 0; 
//		
//		for(int i= a; i<=b; i++) { // a 부터 b까지 누적된 값을 더한다. 
//			sum += i; 
//			
//		} return sum; 
//
//		