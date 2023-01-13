package ch05;

public class CharArray {

	public static void main(String[] args) {		
////		char[] ch = { 'J', 'a', 'v', 'a'}; //실무형 방식 
////		//정석으로 바꿔서 처리 
////		//char[]ch = {'3'};   // char 은 작은 따음표 
////		 
////		
////		for(int i=0; i<ch.length; i++) {
////			 System.out.println(i + "번째 문자 : " + ch[i]);
//		 }   
			 char [] ch;
			 ch = new char[4];
			 System.out.println(ch);
			 ch[0] = 'J';
			 ch[1] = 'A';
			 ch[2] = 'V';
			 ch[3] = 'A';
//		 
			 for(int i=0; i<ch.length; i++) {
				 System.out.println(i +"번째 문자 :" + ch[i] );
				 
			 }
	}

}
