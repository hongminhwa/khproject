package ch06;

import java.util.Scanner;

public class HollidayEx {  
	static int y; // 전역변수 멤버변수 
	
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("근속 연수를 입력하세요 : "); 
		y = scan.nextInt();
		scan.close(); 
		
		
	}
	static int holiday(int year) {
		int day = 0;   // w지역변수  해당 메소드내에서 사용 가능. 
		if(year <= 5) {
			day = 10; 
			
		}else if (year <= 10) {
			day = 15;  
		
		
		}else {
				day = 20; 
		}
		
		return day; 
		
		
		
		
	}
	public static void main(String[] args) { 
		input(); 
		System.out.println("휴가 일수 : " + holiday(y));
	
	}
	
	

}
