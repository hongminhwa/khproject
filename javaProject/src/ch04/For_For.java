package ch04;

public class For_For { 
	public static void main(String[] args) {
		for(int i=1; i<=3; i++) { // outer for문 
			for(int j=1; j<=3; j++) { // 중첩 for문(inner for 문) 
			   // 중첩 for문에서는 변수 사용에 유의하다. (다른 변수 사용) 
				System.out.print("*");
			   
			} // inner for문.
			System.out.println();
		} // outdoor for문. 
	}// end  main() : 프로그램을 종료  

}
