package ch05;

public class Array2Point {

	public static void main(String[] args) {// 국 (0) 영어 (1) 수학(2) 총점(3) 평균(4) 
	 int[][] point = {{80,90,100,0,0},{70,80,90,0,0},{90,80,70,0,0},{90,30,40,0,0},
			 {98,77,88,0,0}}; // 5행 5열
	 
	
		 for(int i=0; i<5; i++) {
			 point[i][3] = point[i][0] + point[i][1]+ point[i][2];
			 point[i][4]= point[i][3]/3;
		 }
		 
		 
		 System.out.println();
		 
		 for(int i=0; i<5; i++) {
			System.out.println(point[i][0]+ "\t" + point[i][1]+ "\t" + point[i][2] + "\t"
			+point[i][3]+"\t"+ point[i][4]);
		 }
		 
		 
		 
		 
	}

}
