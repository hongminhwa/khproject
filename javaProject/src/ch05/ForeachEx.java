package ch05;

public class ForeachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	//enum은 배열 보다 간편하게 쓸수있음. ;쓰면안됨.  
	
	public static void main(String[] args) { 
		int []n = {1,2,3,4,5,};
		String names[] = {"사과","배","바나나","귤","딸기","포도"};
		int sum = 0; 
		
		for(int k:n) {
			System.out.print(k +" ");
			sum += k;
		}
		System.out.println("합은 : " + sum);

		for(String s: names) {
			System.out.println(s + "");
			
			
		}
		System.out.println();
		
		for(Week day : Week.values()) { 
			System.out.println(day + "요일");
			
			
		
			
		}
		
	}

}
