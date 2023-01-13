package ch02;

public class VarScope {
	
	
	static int x; // 전역변수 (멤버 필드) 선언. 

	public static void main(String[] args) { 
		
		int y = 0; // 지역변수 
		
		System.out.println("x = " + x);
		System.out.println("y = " + y); 
		          
	}

}    


// 전역변수의 경우 초기화를 하지 않아도 기본값이 할당된다. 
// 정수형 0 실수형 0.0 논리형 변수 false 
// 지역변수는 내부에 선언된 변수이고 내부에서만 사용 가능하며 호출 될 때 생성 종료시 자동 삭제
// 전역변수 method 외부에 선언되며 class 전체 사용 가능 객체 생성 때 만들어지고 가비지 컬렉터에 의해 삭제. 
