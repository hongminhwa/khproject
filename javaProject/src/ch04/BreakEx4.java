package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		int i=1; 
		while(i<8) { // 1-9까지 반복. 
			if(i==8) break; 
			System.out.println("Hello world");
			i++; 
			
		}
		System.out.println("n값이 8이며 while 문 빠져 나옴.");
	}
}
