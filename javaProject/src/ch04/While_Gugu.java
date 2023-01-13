package ch04;

import java.util.Scanner;

public class While_Gugu {


	public static void main(String[] args) {


		int dan;

		Scanner input = new Scanner(System.in);
		System.out.print("구구단에서 출력하고 싶은 단을 입력하세요 :  ");
		dan= input.nextInt(); 
		
		 
		//dan을 입력하여 정했으면 while문으로 1~9까지 곱하게 반복하도록 해야함.  
		int number =0;
	     while(number <9 ) {
	    	 number++;  // 1부터 9까지 9번 반복함. 
	    	 
	    	 System.out.println(dan+ "X" + number + "=" + dan * number) ;
	    	
	    	 input.close();
                 


			} // while문 괄호 


		}
	 	
	}



