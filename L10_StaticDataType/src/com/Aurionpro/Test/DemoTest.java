package com.Aurionpro.Test;
import com.Aurionpro.Model.*;
public class DemoTest {

	public static void main(String[] args) {
		
		Demo demo =new Demo();
		
		demo.display();
		Demo.increment();
		demo.display();
		
       Demo demo1 =new Demo();
		
		demo1.display();
		Demo.increment();
		demo1.display();
		
	
        Demo demo2 =new Demo();
		
		demo2.display();
		Demo.increment();
		demo2.display();
	}
	
	static {
		System.out.println("Static in main ");
	}
	
}
