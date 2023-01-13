package ch04;

public class if_Else_Ex1 {

	public static void main(String[] args) {
		int score = 100; 
		String result = "";
		if ( score >= 60 ) { //true
			
			result = "입력";
			
		}else {
			result = "불합격";
			
		}
		
		System.out.println(result);
		
	}

}
