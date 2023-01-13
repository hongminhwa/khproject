package ch03;
import java.util.Scanner;

public class JustForFun {

	public static void main(String[] args) {
		String name;
		int Jsp,DB,CSS,Machine, tot;
		double arg;
		
		Scanner knou = new Scanner(System.in);
		
	    System.out.print("이름 : ");
	    name = knou.next();
	    System.out.print("jsp :  ");
	    Jsp = knou.nextInt();
	    System.out.print("DB : ");
	    DB = knou.nextInt();
	    System.out.print("CSS : ");
	    CSS = knou.nextInt();
	    System.out.print("Machine : ");
	    Machine = knou.nextInt();
	    
	    tot = Jsp + DB + CSS + Machine;
	    
	    arg = (Jsp + DB + CSS + Machine)/4;
	    
	    System.out.println( "name\tjsp\tDB\tCSS  Machine\ttot\targ" );
	    System.out.println(name + "\t" + Jsp +"\t"+ DB + "\t" + CSS + "\t" + Machine + "\t" + tot + "\t" + arg);
	    
	    
		
		
	}

}
