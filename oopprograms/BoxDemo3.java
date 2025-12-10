package com.codegnan.oopprograms;

public class BoxDemo3 {

	public static void main(String[] args) {
        //Box3 mybox1=new Box3();
		//System.out.println("my box1 details");
		//mybox1.displayDetails();
		//mybox1.volume();
		
		//Box3 mybox2=new Box(3,4,5);
		//System.out.println("mybox2 details");
		//mybox2.displayDetails();
		//mybox2.volume();
		
		
		Box3 box4=new Box3(10,12,15);
		
		Box3 box5=new Box3(box4);
		System.out.println("original constructor");
		box4.displayDetails();
		box4.volume();
		
		System.out.println("cpoy constructor");
		box5.displayDetails();
		box5.volume();
	}
	
}
		