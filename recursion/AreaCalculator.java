package com.codegnan.recursion;

public class AreaCalculator {
	
	
	public static void rectangleArea(double length,double width) {
		double area=length*width;
		System.out.println("Area Of Rectangle : "+area);
	}

	public static void circleArea(double radius) {
		double area=3.146*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
	public static double squareArea(double side) {
		return side*side;
	}
	public static void triangleArea(double base,double height) {
		double area=0.5*base*height;
		System.out.println("Area of Circle : "+area);
	}
	
	public static void main(String[] args) {
		rectangleArea(10,5);
			AreaCalculator.circleArea(3);
			AreaCalculator ar=new AreaCalculator();
			System.out.println(ar.squareArea(7));
			triangleArea(4,7);
	}
		
		

	}


