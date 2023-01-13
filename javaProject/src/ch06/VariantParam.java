package ch06;

public class VariantParam {   
	
	//자료형 ... 변수 => 가변 사이즈 매게변수, 변수가 배열 참조 변수 
	// 같은 자료형의 매게변수의 개수 관계없이 처리. 
	// 매게변수들이 배열로 저장되는 값. 
	
	public static void main(String[] args) {
		print("java"); 
		print("java", "program");
		print("java", "program", "jsp");
		
		
	}
	static void print(String ... n) { // n 가변형 4개 매개변수(배열 처리 주소값) 
		for (int i=0; i< n.length; i++) {
			System.out.println(n[i]);
			
		}
 		
	}
	
}

//	 static void print(String a, String b, String c) {
//		 
//		 System.out.println(a);
//		 System.out.println(b);
//		 System.out.println(c);
//	}
//
//	static void print(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
//
//	static void print(String a) {
//	System.out.println(a);
//	}
//
//}
