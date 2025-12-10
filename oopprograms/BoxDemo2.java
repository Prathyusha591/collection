package com.codegnan.oopprograms;

public class BoxDemo2 {
	
	public static void main(String[] args) {
		//Box mybox1=new Box();
	    //mybox1.height=2.0;
	   // mybox1.width=3.0;
		//mybox1.depth=5.0;
		//System.out.println("Box1 volume:"+mybox1.volume());
		
		mybox1.setDim(10,20,30);
		System.out.println("volume of box1:"+mybox1.volume());
		
		Box mybox2=new Box();
		mybox2.setDim(2,4,6);
		System.out.println("volume of box2:"+mybox2.volume());
	
	}
		
}	
		

	

	

	
}
