package ch09;

public class ManagerTest { 
	public static void main(String[] args) {
		Employee bnb  = new Employee();
///////////// get&set 이용. 		
		bnb.setNum(1);
		bnb.setName("홍길동");
		bnb.setAddress("서울시 강남구 압구정동");
		bnb.setEmail("hong@naver.com");
		bnb.setRrn("123456-789110");
		bnb.setSalary(3000);
		bnb.setBonus(0);
		
		System.out.println("사번은 :");
		System.out.println("이름은 : " + bnb.getName());
		System.out.println("주소는 : " + bnb.getAddress());
		System.out.println("이메일주소는:"+bnb.getEmail());
		System.out.println("주민등록번호는 :" + bnb.getRrn());
		System.out.println("연봉은 :" + bnb.getSalary());
		System.out.println("보너스는 :"+ bnb.getBonus());
		
		
	}
//	bnb.input(1,"홍길동","서울시강남구압구정동","hong@naver.com","123456-789110",3000,0);
//	
//	bnb.print();
	}

