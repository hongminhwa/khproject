package ch02;

import java.util.Scanner;

public class ForPoint2 {

	public static void main(String[] args) {
		
		
	//// 3사람의 성적. 
//			for(int i=1; i<=3; i++) { // outer for문 
//				for(int j=1; j<=3; j++) { // 중첩 for문(inner for 문) 
	//
//			
			
			//점수 입력하는 메소드  들어갈 재료들 
			 int kor = 0;
			 int kor2 = 0; 
			 int kor3 =0; 
			  int mat = 0; 
			  int mat2 =0; 
			  int mat3 = 0;
			 int eng = 0;
			 int eng2 = 0;
			 int eng3 = 0;
			 
			 int tot = kor + eng + mat;
			 int tot2 = kor2 + eng2 + mat2;
			 int tot3 = kor3 + eng3 + mat3;
			 
			 
			 double avg = (kor+eng+mat)/3;
			 double avg2 = (kor2+eng2+mat2)/3;
			 double avg3 = (kor3+eng3+mat3)/3;

			 
			 	 
			 
			 
			// 점수 입력 스캐너  
			Scanner scan = new Scanner(System.in);
			System.out.println("국어 점수를 입력 하시요 :");
			kor= scan.nextInt();
			System.out.println("영어  점수를 입력 하시요 :");	
			mat= scan.nextInt();
			System.out.println("영어  점수를 입력 하시요 :");
			eng = scan.nextInt();
			
			
			Scanner scan2 = new Scanner(System.in);
			System.out.println("국어 점수를 입력 하시요 :");
			kor2= scan2.nextInt();
			System.out.println("영어  점수를 입력 하시요 :");	
			mat2= scan2.nextInt();
			System.out.println("영어  점수를 입력 하시요 :");
			eng2 = scan2.nextInt();
			
			
			Scanner scan3 = new Scanner(System.in);
			System.out.println("국어 점수를 입력 하시요 :");
			kor3= scan3.nextInt();
			System.out.println("영어  점수를 입력 하시요 :");	
			mat3= scan3.nextInt();
			System.out.println("영어  점수를 입력 하시요 :");
			eng3 = scan3.nextInt();
			
			
			
						
			
			
			// 등급(수우미양가) 나타내는 메소드. 
			String grade = ""; 
			
			 if (avg >= 90) {
				 grade = "수";
				
				 
			 }else if (avg>=80) {
				 grade = "우"; 
				 			 
			 }else if (avg>= 70) {
				 grade = "미";
				 
			 }else if (avg >= 60) {
				 grade = "양"; 
				 
			 } else {
				 grade = "가";
			 }
			 
			 
			 System.out.print("국어\t영어\t수학\t총점\t평균\t등급\t");
			 System.out.println();
			 System.out.println(kor + "\t" + mat + "\t" + eng + "\t" + tot +"\t" + avg + "\t" + grade );
			 System.out.println();
			 System.out.println(kor2 + "\t" + mat2 + "\t" + eng2 + "\t" + tot2 +"\t" + avg2 + "\t" + grade );
			 System.out.println();
			 System.out.println(kor3 + "\t" + mat3 + "\t" + eng3 + "\t" + tot3 +"\t" + avg3 + "\t" + grade );
			 
			 
			 scan.close();
			 scan2.close();
			 scan3.close();

		}
	}