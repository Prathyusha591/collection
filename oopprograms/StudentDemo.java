package com.codegnan.oopprograms;

public class StudentDemo {

	public static void main(String[] args) {

		        Student student1 = new Student();
		        System.out.println("Details of Student 1:");
		        student1.displayDetails();
		        System.out.println("Total Marks: " + student1.calculateTotal());
		        System.out.println("Average Marks: " + student1.calculateAverage());
		        System.out.println();
		        
		        
		        int[] marks = {85, 90, 78};
		        Student student2 = new Student("Alice", 101, marks);
		        System.out.println("Details of Student 2:");
		        student2.displayDetails();
		        System.out.println("Total Marks: " + student2.calculateTotal());
		        System.out.println("Average Marks: " + student2.calculateAverage());
		        

}
}
