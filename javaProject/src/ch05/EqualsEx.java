package ch05;

import java.util.Scanner;

public class EqualsEx {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.print("문자열을 입력해주시요 :"); 
			 // string은 char를 배열화해서 만든 객체이다. 즉 [] = j,a,v,a 처리. 
			 
			 String str= sc.nextLine(); // 문자열을  라인 단위로 읽는 함수. 
			  if(str.equals("exit")) {  // 문자형 참조 변수 equals " 비교형 문자")
				  // 참고 : 값을 비교할 때는 "=="
				  break; 
				  
 				  
			  }else { 
				  System.out.println(str.length() + "글자입니다.");
				  //length() : 문자열에 대한 글자 수 반환 메소드 (배열의 길이 값) 
				  
				  
			  }
			  
		 } System.out.println("프로그램을 종료한다. " );
	}

}
 