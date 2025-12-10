package com.codegnan.java8;

import java.util.function.Predicate;

public class Predicate {

    public static void main(String[] args) {
//       Predicate p=i->i<10;
//       System.out.println(p.test(20));
         
        
         Predicate<String> p=s->s.length()>3;
         System.out.println(p.test("10"));
         System.out.println(p.test("pathu"));
	}


}
