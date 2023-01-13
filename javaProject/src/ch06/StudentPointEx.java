package ch06;

public class StudentPointEx {
	static int[] sunum = {1001,1002,1003};
	static String []name = {"홍길동","사임당","이순신"};
	static int[] java = {90,95,84};
	static int[] DB = {85,79,92}; 
	static int[] HTML = {99,88,95};
	static int[] JSP = {76,92,72};
	static int[] tot = {0,0,0};
	static double[] arg = {0.0,0.0,0.0}; 
	
	// 총점 구하는 메소드 만들것임;
	
	static void getTot() {
		for(int i= 0; i<name.length; i++) {
			tot[i]= java[i] + DB[i] + HTML[i] + JSP[i];	
		}
	}
	
	///평균 구하는 메소드 만들기
	
	static void getAvg() {
		for(int i= 0; i<name.length;i++ ) {
			arg[i] = tot[i]/4.0;
			
		}
	}  //  프린트하는 메소드 구하기. 
	static void print() { 
		System.out.println("---------------------------------------------------------------");
		System.out.println("학번\t이름\tjava\tDB\tHTML\tJSP\ttot\t평균");
		System.out.println("---------------------------------------------------------------");
		
		for(int i=0; i<name.length; i++)  {
			System.out.println(sunum[i]+"\t"+name[i]+"\t"+java[i]+"\t" 
			+DB[i]+"\t"+HTML[i]+"\t"+JSP[i]+"\t"+tot[i]+"\t"+ String.format("%.1f",arg[i]));			
		}
		
	} 
	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
	}
	
	
	
	
	

}
