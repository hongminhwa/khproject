package ch08;

public class AuctionUse { public static void main(String[] args) {
	Auction bnb = new Auction();
	bnb.setName("홍길동");
	bnb.setUserid("hong");
	bnb.setMoney(150000);
	bnb.setGrade("");
	
	System.out.println("이름 : " + bnb.getName());
	System.out.println("아이디 : " + bnb.getUserid());
	System.out.println("구매금액 :" + bnb.getMoney());
	System.out.println("회원등급은 :" + bnb.getGrade());
	
	
	
	bnb.print();
}

}
