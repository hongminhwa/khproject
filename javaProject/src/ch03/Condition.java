package ch03;

public class Condition {  
	public static void main(String[] args) {
		int num =  -5;
		System.out.println(  num >0 ? num : -num );//  삼항 연산자. ? 앞의 값이 참일경우 num 거짓일 경우 -num
		
		
		if(num >0) {
			System.out.println(num);
			
		}else {
			System.out.println(-num);
		}
			
	}

}
