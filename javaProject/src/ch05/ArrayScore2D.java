package ch05;

public class ArrayScore2D {

	public static void main(String[] args) { // 국어(0) 영어(1) 수학(2) 
		//int [][] score = {{90,80,70},{97,87,99},{88,87,78},{77,79,81},{81,85,87}};
		//		 // 정석으로 바꿔보면 

		int[][] score = new int [5][3];

		score[0][0]=  90;
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

		//char grade= ' ';

		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");  
		for(int i= 0; i<score.length; i++) {
			int sum = 0; 	
			float avg= 0.0f; 
			//char grade= ' '; String Char 둘다 콘솔화면에 뜨기는함. 
			String grade=" ";
			System.out.printf("%d\t", i+1);
			for(int j=0; j<score[i].length; j++) {  // 국영수 배열값 처리
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);


			}
			// char grade= ' ';

			avg = sum/(float)score[i].length;  // 평균이 나왔으니 그평균을 가지고.....

			System.out.printf("%d\t %.1f\t%s\t",sum,avg,grade); 

			if(avg>= 90) {			 
				System.out.println("A");
			}else if (avg >=80) {
				System.out.println("B");

			}else if (avg>=70) {
				System.out.println("C");
			}else if(avg>=60) {
				System.out.println("D");

			}else {
				System.out.println("F");
			}

			// System.out.printf("%d\t%.1f\t%s\t", sum,avg,grade); 


			//		 } 
			//콘솔창에 배열만 잘하면 됨 등급까지는 계산 완료 
			// String => %s 


			//		 String grade= " ";
			//		 switch((int)(avg / 10)) {
			//         case 10:
			//         case 9: grade = "A"; break;
			//         case 8: grade = "B"; break; 
			//         case 7: grade = "C"; break;
			//         case 6: grade = "D"; break;
			//         default: grade = "F";
			//         }

			//	System.out.printf("%d\t %.1f%n"%s, sum, avg, grade  ); 

			//char grade= ' ';


			//			  






			//} // end outer for 
		}


	}
}
