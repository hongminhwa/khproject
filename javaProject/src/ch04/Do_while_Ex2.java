package ch04;

public class Do_while_Ex2 {

	public static void main(String[] args) {
		int n = 1;
		do {
			System.out.println(n + "Hello world"); // 반드시 한번은 수행해야함.
			n++;
			
		} while (n<=10);
		System.out.println("while문을 빠져 나옴. ");
		
		
	}

}
