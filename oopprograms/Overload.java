package com.codegnan.oopprograms;

public class Overload {

	public static void main(String[] args) {
        OverloadedDemo ob=new OverloadedDemo();
        ob.test();
        ob.test(10);
        ob.test(10,20);
        System.out.println(ob.test(4f));
	}

}
