package ch09;

public class Scholar extends Student {  //  장학생은 학생이다. is a 관계 
	// is a관계일 때는 부모 멤버들을 그대로 쓸 수 있다. 
	private String category; // 장학금 종류 
	private int money;
	public void input(String name, String num, String major, int year, String category, int money ) {
		super.input(name, num, major, year); // 부모 쪽 input메소드 호출. 
		this.category = category;
		this.money = money;
		// super() -> 부모클래스의 생성자 호출, 첫쨰줄에서 정의한다.  
		// super. => 부모클래스의 변수, 메소드 호출.
		// this() -> 현재 클래스으이 다른 생성자 호출
		// this. =>>  현재 클래스의 변수, 메소드 호출. 
		
		
	}
//	public void print() {
//		System.out.println("이름\t학번\t전공\t학년");
//		System.out.println(this.getName() + "\t" + this.getNum() + "\t" + this.getMajor() + "\t" + this.getYear()); 
//	}
//	
//	public void print2() {
//		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
//		System.out.println(this.getName() + "\t" + this.getNum() + "\t" + this.getMajor() + "\t" + this.getYear() + "\t" + this.getCategory() + "\t" + this.getMoney()); 
//	}
//	
 
}
