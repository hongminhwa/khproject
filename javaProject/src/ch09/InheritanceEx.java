package ch09;

public class InheritanceEx {   
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨강색");  // 객체 생성과 동시에 매게변수가 있는 생성자 호출, 
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		//c1.secret(); // private 처리된 멤버는 타클래스에서 접근 불가하다. 
		
		
		System.out.println("공 : "); 
		c2.findRadius();
		c2.findColor();
		c2.findArea();  
		c2.findVolume();
		
		Circle c3 = new Circle (4);
		Ball c4 = new Ball(); // 기본 생성자를 호출 시 해당클라스에  명시적 코딩 되어있어야한다. 
		
		
		
		
	}

}
