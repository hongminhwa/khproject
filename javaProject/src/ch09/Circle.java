package ch09;

public class Circle {    
	
	private void secret() { // private는 상속이 안됨. 
		System.out.println("비밀이다.");
	}
	
	protected void findRadius() {
		System.out.println("반지름 구하기 ");
	} 
	public void findArea() {
		System.out.println("넓이 구하기 ");
	}
	 public Circle() {
		 // 기본 생성자( 코딩 해야함.) 
		 
	 }
	 public Circle(int r) { // 생성자는 상속의 대상이 아니다. 
		 System.out.println("반지름 : " + r ); 
		 
		 
	 }

}
