package ch05;

public class Array2point2 { 
	public static void main(String[] args) { // 국어 (0) 수학 (1) 영어 (2) 

		//		int [][] score = {{90,80,70},{97,87,99},{88,87,78},{77,79,81},{81,85,87}};
		//		 // 정석으로 바꿔보면 

		int[][] score = new int [5][3];

		score[0][0]= 90;
		score[0][1] = 80; 
		score[0][2] = 70; 
		score[1][0] = 97;
		score[1][1] = 87;
		score[1][2] = 99;
		score[2][0] = 88; 
		score[2][1] = 87;
		score[2][2] = 78;
		score[3][0] = 77;
		score[3][1] = 79; 
		score[3][2] = 81; 
		score[4][0] = 81; 
		score[4][1] = 85; 
		score[4][2] = 87;


		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t");  
		for(int i= 0; i<score.length; i++) {
			int sum = 0; 	 float avg= 0.0f; 
			System.out.printf("%d\t", i+1);

			for(int j=0; j<score[i].length; j++) {  // 국영수 배열값 처리
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);


			}
			avg = sum/(float)score[i].length;


			System.out.printf("%d\t %.1f%n",sum,avg); 






		} // end outer for 
	}


}