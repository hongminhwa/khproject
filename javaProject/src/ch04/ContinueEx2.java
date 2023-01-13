	package ch04;

public class ContinueEx2 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {  //짝수일 때 건너뛴다. 
			if(1%2 == 0) {
				continue; 
			}
			System.out.println("홀수 값 : " + i);
			
		}
	}
}
