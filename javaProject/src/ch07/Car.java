package ch07;

public class Car {    
	String color; 
	int speed; 
	int gear;
	
	// 개발자용 함수. 
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	} 
	
	void changeGear(int g) {  // g는 지역변수. 
		
		gear = g;  
		
		
	}
	void SpeedUp() {
		
		speed = speed + 10; 
		
	}
	void SpeedDown() {
		speed = speed -10; 
		
	}

}

