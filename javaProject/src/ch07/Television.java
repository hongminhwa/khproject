package ch07;
 
public class Television {   
	int channel;  // 전역변수. 초기화 x  0이라는 값이 자동 할당됨.  
	int volume; 
	boolean onOff; // 전원 상태 boolean은 기본적으로 false로 초기화됨 onOff= false;  
	
	
	void print() {
		System.out.println("채널은"  + channel + "이고 볼륨은 " + volume + "이다."); 
		
	}
	int getChannel() {
		return channel; 
		
	}
	void setChannel(int ch) { 
		
		
		channel = ch; 
		
	}

}
