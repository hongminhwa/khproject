package ch05;

public class ScoreAverage {

	public static void main(String[] args) {
		double[][] score = {{3.3,3.4},// 1학년2학기 평점 
				            {3.5,3.6}, // 2학년 1,2학기 평점 
				            {4.1},{4.2}, //3학년 1,2학기 평점 
							{3.7},{3.6}}; // 4학년 1,2학기 평점 
		
		double sum =0.0; 
		for(int year=0; year<score.length; year++) {
			for(int term=0; term<score[year].length; term++) {
				sum += score[year][term];
				
			}
		}
		int n=score.length;
		int m = score[0].length;
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m)); 
		
		
	}

}
