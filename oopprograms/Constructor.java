package com.codegnan.oopprograms;

public class Constructor { 
	double width;
	double height;
	double depth;
	
	public Constructor(double width, double height, double depth) {
		this.height = height;
		this.depth = depth;
		this.width = width;
	}
	
	public Constructor() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	public Constructor(double len) {
		width = height = depth = len;
	}

	public double volume() {
		return width*height*depth;
	}

}
