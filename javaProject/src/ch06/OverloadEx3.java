package ch06;




public class OverloadEx3 { 
	  public static void main(String[] args) {
 //3번		  
		  print("홍길동" , "hong@gmail.com", "010-1111-2222");
		  print("김철수", 90, 100, 100);
		 print("김과장", 5600, 0.3, 0);
		  
	  }
	  
	  
	  
	  static void print(String name, int sal, double tax, double pay) {  // 급여 5600 //세금 x0.3 // 실수령액 
		  System.out.println("===============================");
		  
		  System.out.println("이름\t연봉\t세금\t실수령액"); 
		  
//		  System.out.println( name + "\t" +sal + "/t" + String.format("%.1f", (double)(sal*0.3)+ "\t"
//		  + (sal-String.format("%.1f", (double)(sal*0.3)));
		  System.out.println( name + "\t" + sal + "\t" + (double) sal * 0.3 + "\t" + (sal -(double) sal * 0.3 ) );
		 
		  
		  
		  
	}



	//print메소드 오버로딩. 메게변수가 다를 때 성립  1번
	   static void print(String name, String email, String hp) {
		   
		   System.out.println("==========================="); 
		   System.out.println("이름\t이메일\t\t전화");
		   System.out.println(name + "\t" + email + "\t" + hp);
		   
	   }
	   //2번
	   static void print(String name, int kor, int eng, int math) {
		   System.out.println("======================="); 
		   System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		   
		   System.out.println(name+"\t"+kor+"\t"+eng+"\t"+ math + "\t"+ (kor+eng+math)
				   +"\t"+ String.format("%.1f", (double)(kor+eng+math)/3)); 
		   
	   }
}
