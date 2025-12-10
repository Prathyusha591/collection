package com.codegnan.oopprograms;

public class BoxDemo {

	public static void main(String[] args) {
	Box myBox1 = new Box();
	myBox1.height = 10;
	myBox1.width = 20;
	myBox1.depth = 15;
	double volume1 = myBox1.height *  myBox1.width * myBox1.depth;
	System.out.println("Box1 volume : "+volume1);
	//myBox1=null;
	Box myBox2=new Box();
	myBox2.height=2;
	myBox2.width=3;
	myBox2.depth=5;
	double volume2= myBox2.height*myBox2.width*myBox2.depth;
	System.out.println("Box2 volume :  "+volume2);
	}

}
