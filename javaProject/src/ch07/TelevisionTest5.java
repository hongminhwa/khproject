package ch07;

public class TelevisionTest5 { 
	public static void main(String[] args) {
		Television myTv = new Television();   // 객체 생성. 
		myTv.setChannel(11); 
		int ch = myTv.getChannel();
		System.out.println("현재 체널은 " + ch + "입니다. "); 
		
		
	}

}
