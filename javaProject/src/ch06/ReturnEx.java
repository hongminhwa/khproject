package ch06;

public class ReturnEx {    
	//리턴값 있는 메소드 .
	public static int sum(int a) {  // sum 메소드 만들어놓고 호출을 통해 계속 재사용 가능. 
		
			int result = 0; // 이 주석 값 이 return과 단위 같아야함 
			for(int i=1; i<=a; i++) {
				result = result + i;
				
			}
			return result;  // 메소드를 호출한 곳으로 값을 반환. 
	}
	
     public static void main(String[] args) {
		  int n= sum(50); //  sum 메소드 호출한 후 리턴받은 값을 n에 저장. 
		  System.out.println(n);
		  n = sum(100);// 메소드 재사용. 
		  System.out.println(n);
	}

}
