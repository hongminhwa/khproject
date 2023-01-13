package ch04;

import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) {

		String name = "";
		int price= 0;   // 구매금액 
		int point= 0;  // 포인트 
		int point_use = 0;  //  포인트 사용액  
		int fee = 0;  // 배송료 
		int pay;  // 실제 결제 금액 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 : ");
        name = scan.next();  //문자열을 입력하는 함수 
        System.out.print("구매금액 : ");
        price = scan.nextInt();
        System.out.println("포인트 : ");
        point = scan.nextInt();
        scan.close();
        
        // 게산 
        if(price < 20000 ) {  // 구매 금액이 2만원 미만일 경우 배송료는 2500원 
        	fee = 2500; 
        	
        }
        if( point >= 10000) {  // 포인트가 만점일 경우  
        	point_use = point;// 포인트로 사용 가능 
            pay = price + fee - point;  // 결제 
            
        }else {
        	pay = price + fee;
        	
        }
        // 출력 
        System.out.println("이름\t구매금액\t\t배송료\t포인트사용\t결재금액 ");
        System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+ "\t" + pay);
                
        
        		
	}

}
