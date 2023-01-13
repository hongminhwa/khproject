package ch04;
//브레이크 탈출문. 
public class BreakEx1 {

	public static void main(String[] args) {
		 int i =1;
		 while(true) {
			 System.out.println(i++);
		if(i>=10)
		 break;  //반복문을 종료시킨다.  한줄짜리는  중괄호 생략 가능.  
		 }
		 System.out.println("프로그램을 종료");
		 
		 
	}

}
