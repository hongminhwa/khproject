package ch04;

public class SwitchEx {

	public static void main(String[] args) {
		 int i = 0; i++;  
		 switch(i) {
		 case 1: 
			 
			 System.out.println("1");
			 break;
		 case 2:  // 값 일치 
			 System.out.println("2");
			 break;
			 
		 case 3: 
			 System.out.println("3");
			 break;
	     default: 
	    	 System.out.println("4이상. ");
		 }
	}

}
