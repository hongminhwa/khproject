package ch03;


import java.util.Scanner;


public class CalEx3 {
			
	     public static void main(String[] args) {
			
	    		Scanner in = new Scanner(System.in);
	    		
	    		System.out.print("정수a를 입력하시오 :");
	    		int a = in.nextInt();
	    		System.out.print("정수 b를 입력하시오 : ");
	    		int b = in.nextInt();
	    		
	    		
	    		in.close();
	    		
	    		System.out.printf("a+b=%d\n", a+b);
	    		System.out.printf("a*b=%d\n", a*b);
	    		System.out.printf("a/b=%d\n", a/b, (double)a/b);
	    		System.out.printf("a-b=%d\n", a-b);
	    		
	    		
	     
	     
	     
	     }
	

	      


}
