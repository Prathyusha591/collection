package com.codegnan.file.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class TransientDemo {    //AtmCard related

	public static void main(String[] args) {
         AtmCard originalCard = new AtmCard(755476135741l, 9182, "12/31", 496,  "malli");
         System.out.println("Card Details Before Serialization ");
         originalCard.cardDetails();
         System.out.println("Serialization Started : ");
         try (FileOutputStream fos = new FileOutputStream("atmcard.ser");
        		 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
        	 oos.writeObject(originalCard);
        	System.out.println("Serialized atm card object:"+originalCard);
        	System.out.println("serialization ended");
         }catch(IOException e) {
        	 e.printStackTrace();
         }
         
         System.out.println();
         System.out.println("De-serialization started");
         try(FileInputStream fis=new FileInputStream("atmCard.ser");
        		 ObjectInputStream ois=new ObjectInputStream(fis)){
        	 AtmCard desCard=(AtmCard) ois.readObject();
        	 System.out.println("De-serialization object:"+desCard);
        	 desCard.cardDetails();
        	 System.out.println("De-serialization ended");
         }catch(IOException|ClassNotFoundException e) {
        	 e.printStackTrace();
         }
	}

}
