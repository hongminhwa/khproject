package ch06;

// 메소드를 사용하면 얻을 수 있는 장점 
// 1) 중복코드 줄일 수 있고 재사용 가능하다. 
//2)  모듈화해서 가독성을 높이며, 프로그램도 품질 향상 가능.  


public class MethodEx2 {

	public static void main(String[] args) {
		System.out.println("합은 1~10- : " + sum(1,10));
		System.out.println("합은 10~100 : " + sum(10,100));
		System.out.println("합은 100~1000 :" + sum(100, 1000));
		
	
		
	}
	
	
	public static int sum(int a, int b) {
		
		int sum = 0; 
		
		for(int i= a; i<=b; i++) { // a 부터 b까지 누적된 값을 더한다. 
			sum += i; 
			
		} return sum; 
		
		
		
		
	}
	

}
