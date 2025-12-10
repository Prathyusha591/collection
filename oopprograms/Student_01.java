package com.codegnan.oopprograms;

public class Student_01 {
	String name;
	int rollNumber,age;
	String course;
	
	
	public Student_01() {
		this("pathu");
		System.out.println("Constructor 1 no arg");
	}
	public Student_01(String name) {
		this(name,0);
		System.out.println("Constructor 2 only");
	}
	public Student_01(String name,int rollNumber) {
		this(name,rollNumber,18);
		System.out.println("Constructor 3: name+rollNumber");
	}
	public Student_01(String name,int rollNumber,int age) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.age=age;
		this.course="undefined";
		System.out.println("Constructor 4: name rollNumber age");
		
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("rollNumber:"+rollNumber);
		System.out.println("age:"+age);
		System.out.println("course:"+course);
	
		
}	
		
	}
		
		

		
		