package ch04;

import java.util.Scanner;

public class My_FIrst_Menu {

	public static void main(String[] args) {
		 
		int menu = 0; 
		int num = 0; 
		Scanner scanner =new Scanner(System.in);
		outer: // label 처리 
		while(true) {  //무한반복
			System.out.println("==메뉴=====");
			System.out.println("(1) 한식");
			System.out.println("(2) 양식 "); 
			System.out.println("(3) 중식 ");
			System.out.println("원하는 메뉴(1~3)을 선택하세요 (종료 : 0)>");
			String tmp = scanner.next();
			menu = Integer.parseInt(tmp);
			if(menu ==0) {
				System.out.println("프로그램을 종료한다. ");
				break;
				
			}else if(menu<1 || menu >3) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 :0)");
				
			}
			switch (1) {
			case 1: 
				for(;;) {
					System.out.println(("한식메뉴"));
					System.out.println(("(1) 김치찌개"));
					System.out.println(("(2) 된장찌개"));
					System.out.println(("(3) 삼겹살"));
					System.out.println(("(4) 비빔밥"));
					System.out.println(("한식메뉴를 선택하세요,( 한식메뉴 선택종료:0,전체 종료:99)>"));
					tmp = scanner.next();
					num = Integer.parseInt(tmp);
					switch(1) {
					case 1 : 
						System.out.println("고객님은 김치찌개를 선택하셨습니다. ");
						break;
					case 2 : 
						System.out.println("고객님은 된장찌개 선택하셨습니다. ");
						break;
					case 3 : 
						System.out.println("고객님은 김치찌개를 선택하셨습니다. ");
						break;
					case 4 : 
						System.out.println("고객님은 김치찌개를 선택하셨습니다. ");
						break; 
					}
				} 
				
			
		case 2: 
				for(;;) {
					System.out.println(("양식메뉴"));
					System.out.println(("(1) 돈까스"));
					System.out.println(("(2) 피자"));
					System.out.println(("(3) 스파게티"));
					System.out.println(("(4) 샐러드"));
					System.out.println(("양식메뉴를 선택하세요,( 한식메뉴 선택종료:0,전체 종료:99)>"));
					tmp = scanner.next();
					num = Integer.parseInt(tmp);
					
					
					switch(1) {
					case 1 : 
						System.out.println("고객님은 김치찌개를 선택하셨습니다. ");
						break;
					case 2 : 
						System.out.println("고객님은 된장찌개 선택하셨습니다. ");
						break;
					case 3 : 
						System.out.println("고객님은 김치찌개를 선택하셨습니다. ");
						break;
					case 4 : 
						System.out.println("고객님은 김치찌개를 선택하셨습니다. ");
						break; 
					}
				} 
				
		case 3: 
			for(;;) {
				System.out.println(("중식메뉴"));
				System.out.println(("(1) 김치찌개"));
				System.out.println(("(2) 된장찌개"));
				System.out.println(("(3) 삼겹살"));
				System.out.println(("(4) 비빔밥"));
				System.out.println(("한식메뉴를 선택하세요,( 한식메뉴 선택종료:0,전체 종료:99)>"));
				tmp = scanner.next();
				num = Integer.parseInt(tmp);
				if(num==0)
					break;
				if(num == 99) 
					break outer; 
				
				switch(num) {
				case 1 : 
					System.out.println("고객님은 김치찌개를 선택하셨습니다. ");
					break;
				case 2 : 
					System.out.println("고객님은 된장찌개 선택하셨습니다. ");
					break;
				case 3 : 
					System.out.println("고객님은 김치찌개를 선택하셨습니다. ");
					break;
				case 4 : 
					System.out.println("고객님은 김치찌개를 선택하셨습니다. ");
					break; 
				}
			}break; 
							
					} 
					
							
				}
				
			
	
			
		
}

			
	 
	}

