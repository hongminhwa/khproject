package ch05;

public class Array3Dim {
	
	//3차원 배열: 배열명 = new 자료형 [면][행][열]
	
	public static void main(String[] args) {
	// 2면 3행 4열 
		String[][][] subject  = {
				{{"js01","Al02","PY03","DS04"},
				{"JSp","알고리즘","파이썬", "자료구조"},
				{"홍길동","김철수","이순신","이몽룡"}},
				
				{ // 2면
				
				{"CS01","CS02","CS03","CS04"}, // 과목코드 
				{"생활영어","경제학","생활체육","음악"}, // 과목명 
				{"김영철", "정경제","최배달","조수민"}// 지도교수 
				}}; 
		//subject[0][0][0] = "JS01", subject[0][0][1] = '"AL02" 
		
		for(int i=0; i<subject.length; i++) {  // 면 
			for(int j=0; j<subject[i].length; j++) { // 행
				for(int z=0; z<subject[i][j].length; z++) { // 열 
					System.out.println("["+i+"]"+"["+j+"]"+"["+z+"] :" + subject[i][j][z]);
					
					
				}
			}
		}
		
	}

}
