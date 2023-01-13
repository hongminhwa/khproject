package ch05;

public class ArrayPoint {

	public static void main(String[] args) {
       String[] name= {"홍길동 ", "김철수","이몽룡", "강감찬", "이순신"};
       int[] kor = {100,80,70,60, 90};
       int[] eng = {100,95,96,88,87};
       int[] math = {100,95,96,88,87};
       
       int[] tot = {0,0,0,0,0};
       double[] avg = new double[5]; 
       double tot_avg = 0; //학급평균 
      
       for(int i=0; i<5; i++) {
    	   
    	   tot[i]= kor[i]+eng[i]+math[i];
    	   avg[i]=tot[i]/3.0;
    	   tot_avg=tot_avg+avg[i];
    	   
    		   
       }
       System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
       for(int i=0; i<5; i++) {
    	   System.out.println(name[i]+"\t"+kor[i]+ "\t" +eng[i] +"\t"+math[i]+"\t" 
    	+ tot[i]+"\t" + String.format("%.1f", avg[i]));
       }
       System.out.println("학급 평균 :" + String.format("%.1f",tot_avg/5));
	}

}
