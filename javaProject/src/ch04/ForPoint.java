package ch04;

import java.util.Scanner;


public class ForPoint {

	public static void main(String[] args) {
		
		
	//// 3사람의 성적. 
//			for(int i=1; i<=3; i++) { // outer for문 
//				for(int j=1; j<=3; j++) { // 중첩 for문(inner for 문) 
	//
//			이제 이 메소드를 3번 반복해서 출력하면됨!
	// 3번 연속으로 입력 성공! 
	// 3번 반복하는것을 for문으로 감쌌더니 성공.  
			
			
			//점수 입력하는 메소드  들어갈 재료들 
			 int kor;
			  int mat; 
			 int eng;
			 int tot;
			 double arg; 
			 String answer = " ";
			 
			 
			// 점수 입력 스캐너 
			 for(int i=1; i<=3; i++) {
			Scanner bnb = new Scanner(System.in);
			System.out.println("국어 점수를 입력 하시요 :");
			kor= bnb.nextInt();
			System.out.println("수학 점수를 입력 하시요 :");	
			mat= bnb.nextInt();
			System.out.println("영어  점수를 입력 하시요 :");
			eng = bnb.nextInt();
			
			tot = kor+mat+eng;
			 arg = (kor+mat+eng)/3;

			// 등급(수우미양가) 나타내는 메소드. 
			 
			String grade;
			
			 
			 if (arg >= 90) {
				 grade = "수";
					 
			 }else if (arg>=80) {
				 grade = "우"; 
				 			 
			 }else if (arg>= 70) {
				 grade = "미";
				 
			 }else if (arg >= 60) {
				 grade = "양"; 
				 
			 } else {
				 grade = "가";
			 }   
			 // if문 다 수행 했으면  성적 결과가 있어야할껀데..... 결과니깐 answer을 사용해볼꼐요.  answer = string.  
			 answer += kor + "\t" + mat + "\t" +  eng + "\t" + tot +  "\t" + String.format("%.1f",arg)+"\t" + grade + "\n";
			 
			 } // 이과정을 3번 반복해야함. . 
			
			 // 콘솔창에 출력을 해보자. 
			 System.out.print("국어\t영어\t수학\t총점\t평균\t등급\t");
			 System.out.println();
			 System.out.print(answer);
			 
			
			 } // 성공! 
			
		}


