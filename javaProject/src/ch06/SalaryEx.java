package ch06;

public class SalaryEx {
	
	// 전역 변수(멤버변수는 어디에서나 사용되어지며 값들이 기억되어진다.) 
	
	static String[] name = {"김과장","윤과장","박대리", "김대표", "김실장"}; 
	 static int[]salary = { 2000, 3000, 4000, 6000, 5000};
	 static int[]bonus = { 0,0,0,0,0};
	 static int[] total = new int[5];
	 static int[] tex = new int[5]; 
	 static int[] pay = new int[5]; // 실수령액 
	 static int pay_tot; //총지급액 
	 
	 
	 //계산용 메소드 
	 static void calc() {
		 for(int i= 0; i<name.length; i++) {
			 bonus[i] = (int)(salary[i]*0.3); //좌변이 int여서 균형 맞춰야함.
			 total[i] = salary[i]+bonus[i]; // 총액 연봉 + 보너스 
			 tex[i] = (int)(total[i]* 0.03);   
			 pay[i] = total[i] - tex[i];
			 pay_tot = pay_tot + pay[i];
		 }
		 
	 }
	 //프린트용 메소드 
	 	static void print() {
	 		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
	 		for(int i= 0; i<name.length; i++)  {
	 			System.out.println(name[i] + "\t" + salary[i]+ "\t"+ bonus[i] 
	 			+ "\t"+ total[i] + "\t" + tex[i] + pay[i]);
	 			
	 			
	 		}
	 		System.out.println("총지급액 합계 :" + pay_tot );
	 		System.out.println("총지급액 평균 : "  + pay_tot/name.length);
	 	}
	 
	
	
	
	
	 	/// 메인쪽 코딩양을 줄이도록 노력.. 
	public static void main(String[] args) {
	   calc(); // 계산 용도의 메소드 호출 
	   
	   print(); // 프린트 용도의 메소드 호출 
		
	}

}
