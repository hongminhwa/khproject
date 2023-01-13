package ch09;

public class SportsCarTest {
	public static void main(String[] args) {
	 SportsCar obj = new SportsCar();
	 //sports car 객체는 car를 상속받았기 때문에
	 // 부모클래스가 자동 생성된다 
	 // 부모객체의 멤버들(멤버변수, 멤버메소드)을 모두 사용가능하다. 
	 obj.speed=10; // car 객체의 멤버변수 할당. 
	 obj.setSpeed(60); // car 객체의 부모클라스의 맴버변수. 호출
	 obj.setTurbo(true);
	 
}

}
