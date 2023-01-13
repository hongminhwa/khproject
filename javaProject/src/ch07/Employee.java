package ch07;

public class Employee {
	 private String name; 
	 private String part; // 부서
	 private String position; // 직위
	 private int basic;
	 private int bonus;  //( 기본급의 300%)
	 private int total;  // 기본급 + 보너스 
	 private int tax;  // 총액의 3.3 
	 private int salary;
	
	 public void input(String name, String part, String position, int basic) {
		this.name = name;
		this.part = part;
		this.position = position;
		this.basic = basic;
	} 
	 public void calc() {
		 bonus = basic*3;  //  기본급 300 프로 
		 total=  basic + bonus;  
		 tax = (int)(total*0.033); // 총액의 3.3
		 salary = total - tax; 
		 
		 	 
	 }
	 public void print() {
		  System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t 실수령액");
		  System.out.println( name + "\t" + part + "\t" + position + "\t" + basic + "\t" 
		  + total + "\t" + tax + "/t" + salary);
		  
	 }
	 
	 
	 
	 
	 
	 
	 
}
// 매게변수 선언 -> input-> 계산 -> 프린트 
