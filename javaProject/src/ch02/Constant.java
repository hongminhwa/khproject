package ch02;

public class Constant { 

	public static void main(String[] args) {
       //final  상수 변수. 
		
		final double KM_PER_MILE = 1.609344;
         double km; 
         double mile  = 60.0; 
         km = KM_PER_MILE * mile;
         
         System.out.println("60마일은 " + km + "킬로미터 입니다.");
         
         
         
         
	}
	
	

}
