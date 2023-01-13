package ch03;

import java.util.Scanner;



public class Jumsoo {

	public static void main(String[] args) {
		
		
		String name;
		int java, DB, HTML, JSP, Tot;
		 
		double arg;
		
		Scanner bnb = new Scanner(System.in);
		System.out.print("이름 : ");
		name = bnb.next();
		System.out.print("java  :");
		java = bnb.nextInt();
		System.out.print("DB  : ");
		DB = bnb.nextInt();
		System.out.print("HTML : ");
		HTML = bnb.nextInt();
		System.out.print("JSP : ");
		JSP = bnb.nextInt();
		 // 계산 부분. 
		Tot = java + DB + HTML + JSP;
		arg = (java + DB + HTML + JSP)/4; 
		
		//결과 부분. 
		System.out.println("이름\t java\t DB\t HTML\t JSP\t Tot\t arg");
		System.out.println(name +  "\t" + java+ "\t" + DB +  "\t" +  HTML +  "\t" + JSP +  "\t" + Tot +  "\t" + arg);
	}

}
