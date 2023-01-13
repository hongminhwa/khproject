package ch04;

import java.util.Scanner;
public class While_hakjum {


	public static void main(String[] args) {

		int kor;
		int eng;
		int math; 
		int tot; 
		double arg; 
		String answer = "";  
		char  grade; //string은 문자열 char은 단문자 1바이트 

		System.out.println("전체 성적이 끝나면 마지막에 -1을입력하세요 : ");


		//		for(int i=1; i<=3; i ++) { 반복문은 필요 없어서 주석. 

		Scanner knou = new Scanner(System.in);

		System.out.println("아무정수나 입력하세요 : ");
		int temp = knou.nextInt(); 
		if(temp == -1) {  // -1일 떄 프로그램 종료 시킴. 
			System.out.print("입력된 점수가 없습니다. 프로그램 종료");

		} 
		while(temp != -1) { 					

			System.out.println("국어 점수를 입력하세요 : " );
			kor = knou.nextInt();
			System.out.println("영어 접수를 입력하세요 : ");
			eng = knou.nextInt(); 
			System.out.println("수학 점수를 입력하세요 : ");
			math = knou.nextInt();

			// /////// 

			tot = kor + math + eng;
			arg = (kor + math + eng)/3;

			if(arg>= 90) { 
				grade = '수';
			}else if (arg >= 80) {
				grade = '우';
			} else if (arg>=70) {
				grade ='미';
			}else if (arg>=60) {
				grade ='양'; 
			} else {
				grade = '가';

			}

			answer += kor + "\t" + math + "\t" +  eng + "\t" + tot +  "\t" + String.format("%.1f",arg)+"\t" + grade + "\n";


			System.out.println("계속하려면 아무 정수나 입력하세요 : (종료 버튼은 -1)");

			temp = knou.nextInt();
		}
		knou.close();

		//여기 까지를 3번 반복해야함. 이제 temp 변수가 != -1 , 1일 경우 이것이 실행되니 

		if( answer != "") {
			
			
			System.out.print("국어\t영어\t수학\t총점\t평균\t등급\t");
			 System.out.println();
			 System.out.print(answer);
			 
		}

		//출력을 해야함. 


	}
}

