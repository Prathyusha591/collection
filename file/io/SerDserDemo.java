package com.codegnan.file.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class SerDserDemo {

	public static void main(String[] args) {
	
		// FileOutputStream fos=new FileOutputStream("emp.txt");
		String filePath="emp.txt";
		
		//creating an employee object.
		Employee emp1=new Employee(101,"pathu",4000,"hyd");
		emp1.displayEmpDetails();
		
		try(FileOutputStream fos=new FileOutputStream(filePath);
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(emp1);
			System.out.println("serailazed Employee object:"+emp1);
			System.out.println();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("De-serialization  process");
		try(FileInputStream fis=new FileInputStream(filePath);
				ObjectInputStream ois=new ObjectInputStream(fis)) {
			Employee emp2=(Employee) ois.readObject();
			System.out.println("Employee details after de-seraization");
			emp2.displayEmpDetails();
			System.out.println("de-seralized Employee object:"+emp2);
			
		}catch (IOException|ClassNotFoundException e) {
			e.printStackTrace();
;		}
		

	}
}



