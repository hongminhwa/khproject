package ch07;


public class Person2 {  
	private String name; 
    private String email;
    private int age;  
    private String address;

// setter name          
    public void setname(String name) {    
    	this.name = name;
    }
    
//getter name  
public String getName() {  
	
 	return name; 
 	
 	
 	
}

//setter  email
public void setEmail(String email) { 
	
	this.email = email; 
	
}
//getter email  
public String getEmail() {  
	return  email;  
	
}
//setter age 
public void setAge( int age) {
	if(age<0 || age>150) {
		System.out.println("입력값이 정확하지 않다. ");
	}else {
		this.age = age;
		
	}
		
}

//getter age 
public int getAge() {  
	return age; 
	
	 
} 
 // setter address 
public void setAddress(String address) { 
	this.address = address;

}
//getter address 
public String getAddress() {
	return address;
}
public void print() {
	
	System.out.println("이름  : " + name + "\n" + "나이 :" + age + "\n" + "이메일 주소" + email + "\n" + "주소"+ address + "\n");
	  
	
	

}

}





