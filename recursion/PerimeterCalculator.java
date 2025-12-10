package com.codegnan.recursion;

public class PerimeterCalculator {
	public static double rectangle(double length,double Width) {
		return 2*(length+Width);
	}
    public static double square(double side) {
    	return 4*side;
    }
	public static double circle(double radius) {
		return 2*3.146*radius;
	}
	public static double triangle(double a,double b,double c) {
		return a+b+c;
	}
	public static double parallel(double base,double side) {
		return 2*(base+side);
	}
	
	public static void main(String[] args) {
		System.out.println("perimeter of rectangle:"+rectangle(10,20));
        System.out.println("perimeter of square:"+square(20));
        System.out.println("perimeter of circle:"+circle(10));
        System.out.println("perimeter of triangle:"+triangle(5,6,7));
        System.out.println("parameter of parallel:"+parallel(10,5));
        
        

	}

}
