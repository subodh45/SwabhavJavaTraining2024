package com.Aurionpro.Test;
import com.Aurionpro.Model.*;
import java.util.*;

public class BoxTest {
   public static void main(String[] args) {
	  
	   Scanner sc = new Scanner(System.in); 
	   
	   
	   Box box2 = new Box(10,20,30);
	   Box box1 = new Box();
	   
	  System.out.println("Enter Height :");
	   int height = sc.nextInt();
	   box1.setHeight(height);
	   System.out.println("Enter Width :");
	   int width = sc.nextInt();
	   box1.setWidth(width);
	   System.out.println("Enter length :");
	   int length = sc.nextInt();
	   box1.setLength(length);
	   
	   box1.area();
	   box2.area();
	   	   
}
}
