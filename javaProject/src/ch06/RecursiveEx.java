package ch06;

public class RecursiveEx {   
	
	
	static long fact1(int n) { // 팩토리얼 공식. 
		
		return n==1? 1 : n*fact1(n-1); // 재귀 호출 
	}
//	static long fact2(int n) {
//		long result=1; 
//		for(int i=n; i<n; i++) { 
//			
//			
//		}
//		result = result * 1; 
//	}
//	
	
	
	public static void main(String[] args) {
		
		//엄청 큰 숫자는 Biginteger룰 사용 
		
		System.out.println(fact1(38)); // 5곱하기 4곱하기 3 곱하기  
		
	}
     
}
