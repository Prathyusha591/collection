package com.codegnan.oopprograms;

public class Student {
    // Instance variables
	String name;
	int rollNumber;
	int[] marks;
	
	// Default Constructor
	public Student() {
		name = "Unknown";
		rollNumber = 0;
		marks = new int[] {0, 0, 0};
	}
	
	//Parameterized Constructor
	public Student(String name, int rollNumber, int[] marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		if (marks.length == 3) {
			this.marks = marks;
		} else {
			// Ensure marks has exactly 3 elements
			this.marks = new int[] {0,0,0};
		}
    }
	
	// Method to display details
    public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Marks: ");
		for (int i = 0; i < marks.length;i++) {
			System.out.println("Subject " + (i+1) + ": " + marks[i]);
		}
	}
	// Method to calculate average marks
	int calculateTotal() {
		int total = 0;
		for (int mark : marks) {
			total += mark;
		}
		return total;
	}
	
	// Method to calculate average marks
	double calculateAverage() {
		return calculateTotal() / 3.0;
		
		}
	}














