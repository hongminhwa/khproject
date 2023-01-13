package ch09;

public class Shape { // extends Object     
	private String name;
	public Shape() {
		super();  // object class의 기본 생성자 호출! 
	}
	
	public Shape(String name) {
		super();
		this.name = name;
		
	}
	public String getName() {
		return name;
		
	}
	public double calculateArea() {
		return 0;
	}
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
	
	 

}
