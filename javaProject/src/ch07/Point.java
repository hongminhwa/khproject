package ch07;

public class Point {     // 학점계산 객체지향 
	//멤버변수 
	private String name; 
	private int kor; 
	private int eng; 
	private int math; 
	private int tot; 
	private double arg;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {  
		tot = kor + eng + math; 
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getArg() {
		arg = tot/3.0;
		
		return arg;
	}
	public void setArg(double arg) {
		this.arg = arg;
	}
	public String getGrade() {
		   
		if(arg >= 90) {
			grade = "A";
		}else if(arg >=80) {
			grade = "B";
			
		}else if (arg>=70) {
			grade = "C";
		}else if (arg>=60) {
			grade = "D"; 
		}
		
		
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}  
	
	public void print() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급"); 
		System.out.println(name + "\t" + kor+ "\t" + eng + "\t" + math + "\t" + getTot() + "\t" + String.format("%.1f", getArg()) + "\t" + getGrade());
	}
	
	// getter setter 
	
	
	
		

}
