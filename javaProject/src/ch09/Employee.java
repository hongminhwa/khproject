package ch09;

public class Employee { 
	private int num; 
	private String name; 
	private String address; 
	private String email; 
	protected int salary;
	private String rrn;
	private double bonus;
	
	public Employee( ) {
		
	}
	public Employee(int num, String name, String address, String email, String rrn, int salary, int bonus){
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
		this.rrn = rrn;
		this.bonus = bonus;
	}
	public void input(int num, String name, String address, String email, String rrn, int salary, int bonus) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
		this.rrn = rrn;
		this.bonus = bonus;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	
	public double getBonus() {
		bonus = salary*3.0;
		
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


public void print() {
	System.out.println("사번\t이름\t주소\t이메일\t주민번호\t연봉\t보너스");
	System.out.println(getNum() + "\t" + getName() + "\t" 
	+ getAddress() + "\t" + getEmail() + "\t" 
	+ getRrn()+"\t"+getSalary()+ "\t"+ getBonus());
}
}