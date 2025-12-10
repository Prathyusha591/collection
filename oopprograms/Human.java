package com.codegnan.oopprograms;

public class Human {
	
    String name;
	int age;
	char gender;
	String address;
	

        public Human(String name,int age,char gender,String address) {
        	System.out.println("constructor executed"); 
        	this.name=name;
        	this.age=age;
        	this.gender=gender;
        	this.address=address;
        	
        }
        public Human() {
        	System.out.println("hai");
        }
        
        
        public static void main(String[] args) {
        	Human human1=new Human("sunny",40,'f',"mumbai");
        	System.out.println(human1.name+"---"+human1.age+"----"+human1.gender+"-------"+human1.address+"---");
        	Human human2=new Human();
        	
        }
        
}
