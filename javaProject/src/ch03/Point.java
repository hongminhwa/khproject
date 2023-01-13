package ch03;

import java.util.Scanner;

public class Point {
       public static void main(String[] args) {
		
    	 String name;
    	 int kor, eng, mat, tot;
    	 double arg; 
    	 
    	 Scanner scan = new Scanner(System.in);
    	 System.out.print("이름 : ");
    	 name = scan.next();
    	 System.out.print("국어 : ");
    	 kor = scan.nextInt();
    	 System.out.print("영어  : ");
    	 eng = scan.nextInt();
    	 System.out.print("수학 : ");
    	 mat = scan.nextInt();
    	 scan.close();
    	 
    	 // 계산 
    	 tot = kor + eng + mat;
    	 arg = (kor + eng + mat)/4;
    	 
    	 // 결과를 출력 
    	 System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
    	 System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + arg );
    	  
    	 
       }
}
