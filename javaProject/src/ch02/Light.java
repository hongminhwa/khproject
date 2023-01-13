package ch02;

public class Light {
     public static void main(String[] args) {
		
    	 //  long ->  8byte 64 bit
    	 long  lightspeed;
		 long distance;
		 
		 lightspeed = 300000L;
		 distance = lightspeed * 365L * 24 * 60 * 60;
		 // 빛의 속도 * 365일 * 24시 * 60분 * 60초 

		 
		 System.out.println("빛이 1년동안 가는 거리 : " + distance + "km");
		 //  "문자열" * 변수 = i 여기서의 + 기호는 연결연산자임. 
		 
		 
	}
}
