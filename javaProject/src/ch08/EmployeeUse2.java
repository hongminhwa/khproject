package ch08;

public class EmployeeUse2 { public static void main(String[] args) {
	
	Employee2 bnb = new Employee2(); 
	
	bnb.setName("홍길동"); // 이름
	bnb.setPart("관리부 ");
	bnb.setPosition("과장");//직위
	bnb.setBasic(300);  // 기본급
	bnb.setBonus(0); // 보너스 
	bnb.setTotal(0); // 총액 
	bnb.setTax(0);  // 세금 
	bnb.setSalary(0); // 실수령액 
	
	System.out.println("이름 : " + bnb.getName());
	System.out.println("부서 :" + bnb.getPart());
	System.out.println("직위 :" + bnb.getPosition());
	System.out.println("기본급 :" + bnb.getBasic());
	System.out.println("보너스 : " + bnb.getBonus());
	System.out.println("총액 : " + bnb.getTotal());
	System.out.println("세금 : " + bnb.getTax());
	System.out.println("실수령액 :" + bnb.getSalary());
	
	bnb.print();
	 
}


}
