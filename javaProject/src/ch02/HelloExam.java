package ch02;

/*  
 * 2022년 12월 13일 두번째 시간. 
 * 
 * */

public class HelloExam {  

	
	// 사용자 정의 메서드 
	public static int sum(int n, int m) { // sum // n = 20, m = 10  
		return n + m;


	}
	
	// 프로그램의 시작은 메인 메서드 부터
	
	public static void main(String[] args ) { //메인 메소드 

		int i = 20; // 변수 초기화 or 할당 
		int s; // 선언  
		char a; // 변수 선언. 

		s = sum(i, 10); //  s= 30 할당한다. = -> 우변의 값을 좌변으로 치환. 
		a = '?'; // 변수를 초기화 


		System.out.println(a);	

		System.out.println(s);
	}// 프로그램 종료 

      
}
