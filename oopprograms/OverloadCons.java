package com.codegnan.oopprograms;

public class OverloadCons {

	public static void main(String[] args) {
		Constructor ob1=new Constructor(10,20,15);
		System.out.println("volume of ob1 is "+ob1.volume());
		Constructor ob2=new Constructor();
		System.out.println("volume of ob2 is "+ob2.volume());
		Constructor obcube=new Constructor(3);
		System.out.println("volume of obcube is"+obcube.volume());

	}

}
