package ch07;

public class TelevisionTest {
		 public static void main(String[] args) {
			   Television tv = new Television();  // 객체를 생서하여 메모리에 올림. 인스턴스 화 
			   
			   System.out.println(tv);
			   tv.channel = 7; 
			   tv.volume = 9; 
			   tv.onOff = true; 
			   System.out.println("탤레비젼의 체널은 " + tv.channel + "이고 볼륨은 " + tv.volume + "이고 티비 전원은 " + tv.onOff + "이다. ");
			   
			   
		}
}
