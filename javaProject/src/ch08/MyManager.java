package ch08; 
// 싱글톤 기법 


public class MyManager {
	private int score;
	
	private MyManager(int score)  {  
		this.score = score; 
		
		
	}
	private static MyManager mgr;  // 객체형 데이터타입 참조변수 
	
	public static MyManager getInstance() {
		if(mgr==null) {   // 처음 MYMANAGER가 객체화 될 때의 경우 
			mgr = new MyManager(10);
			
			
		}
		return mgr; // 한번이상 객체 생성되었다면 (
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

