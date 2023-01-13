package ch09;

public class TriangleShape extends Shape {   
	 private int width; 
	 private int height;
	//getter setter
	 public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
//생성자  // getter setter 생성후 string fidelds
	public TriangleShape(int width, int height) {
		super("Triangle ");
		this.width = width;
		this.height = height;
	}
	private double claculateArea() {
		return width * (height*0.5);
	
	}
	//@Override
    public void draw() {
		System.out.println("높이가 " + height +", 밑변이 " + width + "인삼각형" );
		super.draw();
	}

}
