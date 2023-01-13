package ch03;

public class CastEx {
      public static void main(String[] args) { 
    	  
    	  
    	  float f = 1.6f;  // float의 경우 끝에 f 붙일것
    	  
    	  f = 100;  //자동형변환 (정수 100을  자동으로 float 형 실수 100.0f로 변환 )
    	  
    	  System.out.println(f);
    	  
    	   f= 100.5f;
    	   int i = (int)f;  //  명시적 형변환.  우변의 타입을 좌변의 타입으로 맞춰줄것.
    	   
    	   
    	   System.out.println(i);
    	   
    	  
    	  
		
	}
}
