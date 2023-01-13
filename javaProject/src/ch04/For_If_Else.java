package ch04;

public class For_If_Else {

	public static void main(String[] args) {
		 int sum = 0; 
		 for(int i=1; i<=10; i++ ) {
			 sum += i; // i는 10이고 
			 System.out.print(i);
			 if(i<=9) { // 1~ 9까지는 '+'출력. 
				 System.out.print("+");
				 
			 }else {  // 1이 10인 경우. =하고 sum출력. 
				 System.out.print("=");
				 System.out.print(sum);
			 }
		 }
	}

}
