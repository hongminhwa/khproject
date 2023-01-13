package ch05;

public class GetMin {

	public static void main(String[] args) {
		 int s[] = {12,3,19,6,18,8,12,4,1,9};
		 int minimum;
		 minimum = s[0]; // minimum = 12 
		 for(int i=1; i<s.length; i++) {
			 if( s[i] <  minimum) {  // 3 <12 
				 minimum = s[i]; // minimum을 3으로 변경 
				 
				 
				 
			 }
			 
		 }
		 System.out.print("최소값은 : " + minimum);
		 
		 int a[]  = {12,3,19,6,18,8,12,4,1,9}; 
		 
	}

}
