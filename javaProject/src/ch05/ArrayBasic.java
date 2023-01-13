package ch05;

public class ArrayBasic {

	public static void main(String[] args) {
	int [] score; // 배열 참조변수를 선언한다. 
		score = new int[5]; // new를 통해 메모리에 5개의 int형 자리를 준비한다. 
		/// 배열 (4byte * 5 = 20byte) 
		
		System.out.println(score); // score -> 메모리의 주소 값을 가리키는 참조변수.
		score[0] = 100;  // 반드시 int형 데이터만 들어가야한다.
		score[1] = 90;
		score[2] = 80; 		
		score[3] = 70; 
		score[4] = 60;
		// score[5] = 50; // 범위 초과, error
		
		
//	     int [] score = {100,90,80,70,60}; // 실무형 배열 처리 	
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		// 배열을 다루기 위해서 for문은 거의 필수적으로 사용. 
		for(int i=0; i<5; i++) {
			System.out.println((score[i]));	
		}
	}

}
