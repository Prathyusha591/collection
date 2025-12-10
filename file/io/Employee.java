package com.codegnan.file.io;

import java.io.Serializable;

public class Employee  implements Serializable {
      int empId;
      String empName;
      double empSalary;
      String empLocation;
      
    public Employee(int empId,String empName, double empSalary, String empLocation) {
        super();
		this.empId = empId;
        this.empName = empName;
		this.empSalary = empSalary;
 		this.empLocation = empLocation;//constructor source
	}
public void displayEmpDetails() {
	System.out.println("Employee Id:"+empId);
	System.out.println("Employee Name:"+empName);
	System.out.println("Employee salary:"+empSalary);
	System.out.println("Employee Location);"+empLocation);
	
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empLocation="
			+ empLocation + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
}
