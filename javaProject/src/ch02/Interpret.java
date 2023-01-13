package ch02;

public class Interpret {

	public static void main(String[] args) {
        
		int a;
		int b;
		int tot;
		
		 a = 1; 
		 b = 2;
		 
		
		tot = a + b;  //  변수에 할당 되지 않는 상태에서 연산이 되어서 에러가 난다. 
		 				// 순차적 인터프리트 방식 때문이다. 
		 
		 System.out.println(tot);
	}

}
