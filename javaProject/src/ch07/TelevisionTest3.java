package ch07;

public class TelevisionTest3 { 
	public static void main(String[] args) {
		Television myTv = new Television(); 
		 
		myTv.channel = 7; 
		myTv.volume = 9; 
		myTv.onOff = false;
		
		Television youtube = new Television();
		youtube.channel = 8;
		youtube.volume = 10; 
		youtube.onOff = true;
		
	}

}
