package ch02;


import java.util.Scanner;


public class RectangleTest {

	public static void main(String[] args) {
             Scanner box = new Scanner(System.in);
             
          
             
            System.out.print("직사각형의 가로 길이를 입력하세요 : ");
     	    int width =  box.nextInt();
     	    System.out.print("직사각형의 세로 길이를 입려하세요  :");
            int vertical= box.nextInt();
            
             double area = width * vertical;
             System.out.println("직사각형의 넓이는 : " + area );
             
             
	}

}
