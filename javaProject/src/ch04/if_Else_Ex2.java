package ch04;

public class if_Else_Ex2 {

	public static void main(String[] args) {
		 int kor = 45; 
		 int mat = 90; 
		 int eng = 80;
		 int tot = kor + eng + mat;
		 
		 double arg = tot/3.0;  // 평균 
		 
		 String grade = ""; // 등급(수우미양가)
		 
		 if (arg >= 90) {
			 grade = "수";
			
			 
		 }else if (arg>=80) {
			 grade = "우"; 
			 			 
		 }else if (arg>= 70) {
			 grade = "미";
			 
		 }else if (arg >= 60) {
			 grade = "양"; 
			 
		 } else {
			 grade = "가";
		 }
		 
		 // 결과 출력 
		
		 System.out.println(kor +"\t" + mat + "\t" + eng + "\t" + tot +"\t" + arg + "\t" + grade );
		;
		 
	}

}
