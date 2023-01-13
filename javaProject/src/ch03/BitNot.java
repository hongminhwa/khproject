package ch03;

public class BitNot {

	public static void main(String[] args) {
		 byte a = 10; 
		 System.out.println(a); 
		 // ~ 연산자(비트 값을 반전시킴. 0을 1로 1을 0으로 바꾼다. 실제 계산에서는 첫번째 반전. 
		 // 다시한번 반전을 시키며 오른쪽 끝 비트를 제외 후 앞의 부호도 반대를 시킨다. 
		 
		 System.out.println(~a);   // 0101-> 1011 -> -1011 -> 10진수로 11이 된다. 
	}

}
