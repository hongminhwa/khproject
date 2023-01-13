package ch06;

public class VoidExam {
	public static void hello()  { // void return값 없음. 
		     System.out.println("안녕하세요 ");
		     return; // 메소드 종료 생략 가능. 
	}

	public static void main(String[] args) {  // 시작 기준. 
		 System.out.println("프로그램 시작");
		 hello(); 
		 System.out.println("끝");
	}

}
