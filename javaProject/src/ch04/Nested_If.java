package ch04;

import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {

		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("범위의 정수를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("범위의 정수를 입력하세요 : ");
		b = sc.nextInt();
		sc.close();
		
		if (a>b) {
			if((a %2)==0) {
				
			System.out.print(a + "는" + b + "보다 큰 짝수");
			
		}else {
			System.out.print(a + "는" + b + "보다 큰 홀수 ");
		}
		}else {
			if((a%2)==0) {
				System.out.print(a + "는" + b + "보다 큰 짝수");
			}else {
				
			System.out.print(a + "는" + b + "보다 큰 홀수 ");
			
			}
				
		}
	}

}
