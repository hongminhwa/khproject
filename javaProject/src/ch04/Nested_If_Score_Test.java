package ch04;
import java.util.Scanner;

public class Nested_If_Score_Test {

	public static void main(String[] args) {
		
		String name;
		 int java;
		int score= 90; 
		 char grade = ' ';
		 char lev = '0';  // A0 B0
		Scanner scan = new Scanner(System.in);	 
				
		
		if(score >= 90) {
			grade = 'A';
		if(score > 97) {	
			lev = '+';
			
		}else if(score > 94) {
			lev = '-';
			
		}

		 }else if (score >= 80) {
			 grade = 'B';
			 if(score > 87) {
				 lev = '+';   
			 }
		 }else  {
			 grade = 'F';
			 System.out.print("재수강 대상자입니다. ");
		 }
		 
		 
		 System.out.println("당신의 점수는 " + score + "이고"+ " 등급은 " + grade + lev + "입니다." ); 
 				 
			
		 

	}

}
