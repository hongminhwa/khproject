package ch06;

public class Method_CallEx { 
	// 메소드의 위치는 main()의 위아래 상관없다. 

	public static void test (int b) {
		System.out.println("test method 호출"); 
		System.out.println(b); 
    	
	}
    public static void main(String[] args) {
		System.out.println("시작"); 
		int a  = 10; 
		test(a);// 갔다가 다시 main으로 돌아올것 
		
		test2(a);  // test2가 아직 안만들어진 상황에서 마우스 갔다대면 test2 생성 가능. 
		
		System.out.println("끝 ");
	}// 프로그램 종료 
    
    
	private static void test2(int a) {
		  System.out.println("test2의 값을 출력 " + a);
 	}

}
