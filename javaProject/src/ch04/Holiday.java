package ch04;
import java.util.Scanner;

// 휴가일수 
// 근속연수 1~3년 -> 3일, 4-9년 ->  5일 
//10년 이상 10일, 20년 이상 => 20일 

public class Holiday {

	
	public static void main(String[] args) {
		// 변수 선언. 
		int year; // 근속 연수 
		 int days;
		 // 입력 
		 Scanner scan = new Scanner(System.in);
		 System.out.print("근속연수를 입력하세요 : ");
		 year = scan.nextInt();
		 scan.close();
		 
		 // 계산. 
		 if( year >= 3) {
			 days = 3; 
		 }
		 
		 else if (year < 10) {
			 days = 5; 
			 
		 }else if (year <20) {
			 days = 10;
			 
		 } else { // 그 외의 모든 경우 
			 days = 20;
			 
		 }
		 // 출력 
		 System.out.println("당신의 근속연수는 " + year + "년이고 " + days + "일입니다. ");
		 }
		 
		 

}
