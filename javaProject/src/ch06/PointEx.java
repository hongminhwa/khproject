package ch06;


    
public class PointEx {
	static String [] name = {"홍길동", "김철수", "이순신", "차두리", "손흥민"};
	static int[] kor = {90,80,70,100,88};
	static int[] eng = {100,100,98,99,100};
	static int[] math = {100,88,77,79,83};
	static int[] tot = {0,0,0,0,0};
	static double[] arg = {0.0,0.0,0.0,0.0,0.0};
	
	
	static void getTot() { // 총점 계산 용 
		for(int i=0; i<5; i++) {
			
			tot[i] = kor[i]+eng[i]+math[i];
			//tot[i] = kor[i] + eng[i] + math[i];
		}
	}
	 static void getAvg() {   // 평균형 계산 메소드.
		for(int i=0; i<5; i++) {
			arg[i] = tot[i]/3.0;
			
		}
	}
	 static void print() {
		 System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		 for(int i=0; i<5; i++) {
			 System.out.println(name[i]+"\t"+kor[i]+"\t" +eng[i]+"\t"+ math[i]
			+"\t"+tot[i]+"\t"+String.format("%.1f",arg[i]));
			 
		 }
	 }
	 public static void main(String[] args) {
		 getTot();
		 getAvg();
		 print();
		 
		
	}
}
		
	


