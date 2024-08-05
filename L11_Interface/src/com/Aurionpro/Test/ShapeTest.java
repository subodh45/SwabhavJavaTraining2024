package com.Aurionpro.Test;
import com.Aurionpro.Model.*;

public class ShapeTest {
 public static void main(String[] args) {
	
	Shape shape;
	shape =new Circle(20);
	shape.area();
	
	shape = new Rectangle(30,50);
	shape.area();
}
}
