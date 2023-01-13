package ch03;

public class CastEx2 {
     public static void main(String[] args) {
		
    	 int a = 500; 
    	 float b = 200.2f;
    	 int c = 127;
    	 
    	 
    	 
    	 double d = a;// 자동 형변환. 
    	 
    	 System.out.println("int a => double :"  + d);
    	 
    	 int e = (int) b;  // 명시적 형변환 float 가 int 보다 크기 때문에 형변환을 할 경우 앞에 int를 붙여야함.
    	 
    	 byte f = (byte) c;
    	 System.out.println("int c => byte :" + f);
    	 
    	 
	}
}
