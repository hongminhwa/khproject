package ch05;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		 int intArray[] = new int[5];  // 배열 선언과 생성. 
		 int sum = 0; 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println(intArray.length + "개의 점수를 입력하세요 : ");
		 
		 for(int i = 0; i<intArray.length; i++) {
			 intArray[i] = scanner.nextInt();	
			 
		 }
		 for (int i=0; i<intArray.length; i++) {
			 sum += intArray[i];  // 배열의 저장된 정수 값 누적하기  
			 
			 
		 }
		 System.out.println("평균은 " + (double)sum/intArray.length);
 		 
	}

}
