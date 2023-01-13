package ch07;

public class TelevisionTest2 {
      public static void main(String[] args) {
    	   Television myTv = new Television(); 
    	   System.out.println(myTv); //  메모리 주소값 (해쉬 코드 ) 
    	   myTv.channel = 7; 
    	   myTv.volume = 10; 
    	   myTv.onOff = true; 
    	   System.out.println("나의 텔레비젼의 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "티비 상태는 " 
    	   + myTv.onOff  + "이다");
    	   
    	   
    	   Television youtube = new Television();
    	   System.out.println(youtube); 
    	   youtube.channel= 8; 
    	   youtube.volume = 19; 
    	   youtube.onOff = false; 
    	   
    	   System.out.println("유튜브 채널은 " + youtube.channel + "이고 볼륨 크기는 " + youtube.volume
    			   + "이고  전원은 " + youtube.onOff + "이다. " );
    	   
	}
}
