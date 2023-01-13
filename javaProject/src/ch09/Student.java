package ch09;

public class Student {  
	// 멤버변수 
	protected String name;
	protected String num; // 학번
	protected String major; // 전공 
	private int year;  // 학년
	private String category;
	private int money;
	
	public Student() {
		
	}
	public Student(String name, String num, String major, int year) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	// 상속 관계의 클래스들에서는 생성보다는 메소드를 잘 활용한다. 
	public void input(String name, String num, String major, int year) {
		this.name = name; 
		this.num = num;
		this.major = major; 
		this.year = year; 
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void print() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(this.getName() + "\t" + this.getNum() + "\t" + this.getMajor() + "\t" + this.getYear()); 
	}
	
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(this.getName() + "\t" + this.getNum() + "\t" + this.getMajor() + "\t" + this.getYear() + "\t" + this.getCategory() + "\t" + this.getMoney()); 
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	// 생성자 
	
