package ch04;

public class Switch_Point {

	public static void main(String[] args) {
          int kor = 85; 
          int mat = 90; 
          int eng = 90;
          int tot = kor + mat + eng; 
          double avg = tot / 3.0;
          String grade = "";
          
          switch((int)(avg / 10)) {
          case 10:
          case 9: grade = "수"; break;
          case 8: grade = "우"; break; 
          case 7: grade = "미"; break;
          case 6: grade = "양"; break;
          default: grade = "가";
          }
          
          System.out.println("kor\tmath\teng\ttot\tavg\t");
          System.out.println(kor +"\t" + mat + "\t" + eng + "\t" + tot +"\t" + avg + "\t" + grade );
          
        	  
          }
        	  
          
	}


