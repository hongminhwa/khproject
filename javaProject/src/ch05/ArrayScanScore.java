package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		 
		int total = 0; 
		int student = 0; 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 수를 입력하시요 : ");
		student = scan.nextInt();
		int[] scores = new int[student]; 
		for(int i= 0; i<scores.length; i++) {
			   System.out.println("성적을 입력하세요 : ");
			   scores[i] = scan.nextInt();
		}
		for(int i= 0; i<scores.length; i++ ) {
			total += scores[i]; //  
		
		}
		
		System.out.println("총점은 " + total +"입니다.");
		System.out.println("평균 성적은 " + total/scores.length + "입니다. ");
		 scan.close();
			   
			   
		
		}
		
	}


