package ch05;

public class ArrayTest2 {

	public static void main(String[] args) {
		 int sum=0;  // sum 총점 합계 값. 
		 float average = 0f;  //float의 평균값은 f
		 int [] score = {100,70,80,90,77};
		 for(int i= 0; i<score.length; i++) {
			 sum += score[i]; // sum = sum + score[i]
		 }
		 average = sum/(float)score.length;  // 계산 결과를 float으로 받기 위해 (float) 처리 
		 
		 System.out.println("총점 : "+ sum); 
		 System.out.println("평균 : " + average); 
		 
		 
	}

}
