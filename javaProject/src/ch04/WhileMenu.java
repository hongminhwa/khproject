package ch04;

import java.util.Scanner;

public class WhileMenu {

	public static void main(String[] args) {
		 int menu = 0; 
		 Scanner scanner = new Scanner(System.in);
		 
		 while(true) {
			 System.out.println("(1) 아메리카노");
			 System.out.println("(2) 카페모카 ");
			 System.out.println("(3) 카페라테 ");
			  
			 
			System.out.println("원하는 매뉴 (1~3)을 선택하세요. (종료:0) >");
			String tmp = scanner.next(); //문자 입력 
			menu = Integer.parseInt(tmp); //입력 받은 문자를 숫자로 변환 ex_"2"= 2
			if(menu == 0) {
				System.out.println("프로그램을 종료한다."); 
				break;
				
			}else if(menu < 1 || menu > 3) {
				System.out.println("메뉴 잘못 선택하셨습니다.(종료는 0) ");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다. "); 
			
		 }
		 scanner.close();
			 
		 }
	}