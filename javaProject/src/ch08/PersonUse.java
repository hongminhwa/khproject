package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person(); /// 겍체 생성겸  
		p1.showInfo();
		
		Person p2 = new Person("이승엽");
		p2.showInfo();
		
		Person p3 = new Person("류현진",192);
		p3.showInfo();
		
		Person P4 = new Person("오승환", 190, 100);
		P4.showInfo(); 
		
		
		
		
	}
}
