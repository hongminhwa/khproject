package ch05;

import java.util.Arrays;

// 얕은 복사 // 깊은 복사. 
public class ArrayCopy { 

	public static void main(String[] args) {
		   int [] list= {10,20,30,40,50};
		   System.out.println(list);
		  // 배열 복사 방법 2가지 
		  // 1) 얕은 복사 : 배열의 주소값을 공유해서 복사. 
		   int []numbers = list; 
		   for(int i= 0; i< numbers.length; i++) {
			   System.out.println(numbers[i]);
			   
		   
		   
		      //2번쩨 깉은 복사 : 새 배열을 만들어서 데이터 자체를 복사. 
//		   int[] list_copy = Arrays.copyOf((list, list.length));
//		   for(int value : list_copy) {
//			   System.out.println(value);
		   }
		   
	}

}

