package ch09;

public class Manager extends Employee { 
	private int num; 
	private String name; 
	private String address; 
	private String email; 
	protected int salary;
	private String rrn; 
	private double bonus;
	
	public void input(int num, String name, String company, String address
			,String email, int salary, String rrn) {
		setNum(num);
		setName(name);
		setAddress(address);
		setEmail(email);
		setSalary(salary);
	    setRrn(rrn);
	    this.bonus= bonus;
	    	      
		
	} 
//	public void print() {
//		System.out.println("사번\t이름\t주소\t이메일\t주민번호\t연봉\t보너스");
//		System.out.println(getNum() + "\t" + getName() + "\t" 
//		+ getAddress() + "\t" + getEmail() + "\t" 
//		+ getSalary()+"\t"+getRrn()+ "\t"+ getBonus());
//	}
	// 

}
