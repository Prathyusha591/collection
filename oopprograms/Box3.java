package com.codegnan.oopprograms;

public class Box3 {
    double width;
    double height;
    double depth;
    
    //default constructor.
    public Box3() {
    	System.out.println("default constructor");
    	width=10;
    	height=20;
    	depth=30;
    	
    }
    public Box3(double width,double height,double depth) {
    	this.width=width;
    	this.height=height;
    	this.depth=depth;
    }
    public void volume() {
    	double volume=width*height*depth;
    	System.out.println("volume:"+volume);
    }
    public Box3(Box obj) {
    	width=obj.width;
    	height=obj.height;
    	depth=obj.depth;
    }
    public void displayDetails() {
    	System.out.println("width:"+width);
    	System.out.println("height:"+height);
    	System.out.println("depth:"+depth);
    }

}
