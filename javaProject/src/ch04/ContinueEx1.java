package ch04;

public class ContinueEx1 {

	public static void main(String[] args) {
		 for(int i=1; i<=10; i++) {
			 
			 // 5의 배수를 만나면 출력 안함.
			 
			 if(1%5 == 0) continue;  
			 System.out.println(i); 
			 
		 }
	}

}
