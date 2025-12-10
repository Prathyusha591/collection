package com.codegnan.file.io;

public class Person {
	int id;
	String name;
	String email;

//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}

	public Person(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
    public String toCSV() {
    	return id+","+name+","+email;

	}

}
