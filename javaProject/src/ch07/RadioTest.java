package ch07;

public class RadioTest { 
	
	public static void main(String[] args) {
	 System.out.println("전원 값이 true= 켜졌다.  false = 꺼졌다.");
		Radio kbs = new Radio(); 
	  System.out.println(kbs);
	  kbs.channel = 89.1; 
	  kbs.volume = 12; 
	  kbs.onoff = true; 
	  //System.out.println("kbs 라디오 채널은 " + kbs.channel + "이고\n 볼륨의 크기는 "
	  //+  kbs.volume + "이고\n 라디오의 전원은 " + kbs.onoff + "입니다");
	  System.out.println("라디오 전원은 " + kbs.onoff + "입니다.\n" 
	  +"현재 채널은"+kbs.channel+"이고\n"+"볼륨의 크기는" +kbs.volume +"입니다.");
	  
	  Radio tbs = new Radio();
	  System.out.println(tbs);
	  tbs.channel  = 95.1; 
	  tbs.volume = 9; 
	  tbs.onoff = false;   
	  //System.out.println("tbs 라디오 채널은 " + tbs.channel + "이고\n 볼륨의 크기는 "
			//  +  tbs.volume + "이고\n 라디오 전원 상태는 "+ tbs.onoff +"입니다.");
	  System.out.println("라디오 전원은"+tbs.onoff+"이다.\n현재 채널은"+tbs.channel+"입니다\n"
	  		+"볼륨의 크기는"+tbs.volume+"입니다.");
		 
} 
}