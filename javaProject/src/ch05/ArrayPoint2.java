package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		
		
		int [] kor = {0,0};
		int [] eng = {0,0};
		int [] math = {0,0}; 
		int [] tot = {0,0};
		double[] avg = new double[2]; 
		//String[] name= {};
		double tot_avg = 0;//학급평균 
		String name[]= {"",""};/////////////////////////
		
		
		    for(int i=0; i<2; i++) {
			Scanner knou = new Scanner(System.in); 
			System.out.println("이름을 입려하세요"); 
			name[i] = knou.next();
			System.out.println("국어 점수를 입력 하시요 :");
			kor[i]= knou.nextInt();
			System.out.println("수학 점수를 입력 하시요 :");	
			math[i]= knou.nextInt();
			System.out.println("영어  점수를 입력 하시요 :");
			eng[i]= knou.nextInt();
			
			// 총점 
			tot[i]= kor[i]+eng[i]+math[i];
			// 평균 
			avg[i]=tot[i]/3.0; 
			//학급평균. 
			tot_avg=tot_avg+avg[i];
			
			
		    
		    
		    }
		  
			
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			
			
			 for(int i=0; i<2; i++) {
		    	   System.out.println(name[i]+"\t"+kor[i]+ "\t" +eng[i] +"\t"+math[i]+"\t" 
		    	+ tot[i]+"\t" + String.format("%.1f", avg[i]));
		       }
		       
		    
		     System.out.println();
			 System.out.println("학급 평균 :" + String.format("%.1f",tot_avg/2));
			
		       
		
	}	
	
	}		
			
		
		
