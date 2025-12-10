package com.codegnan.oopprograms;

public class Rectangle {
	double length;
	double width;
	
	public void setDim(double l,double w) {
		length=1;
		width=w;
	}
	
	public double calculateArea() {
		double area=length*width;
		return area;
		}
	
	public double calculatePeri() {
		double peri=2*(length+width);
		return peri;
		
	}
	public void displayDetails() {
		System.out.println("length:"+length);
		System.out.println("width:"+width);
		System.out.println("area:"+calculateArea());
		System.out.println("peri:"+calculatePeri());

	}

	
    }
