package com.Aurionpro.Test;

class OuterClass {
	// static member
	static int outer_x = 10;

	int outer_y = 20;

	
	private int outer_private = 30;

	class InnerClass2 {
		void display()
		{
			System.out.println("outer_x = " + outer_x);

			System.out.println("outer_y = " + outer_y);
			System.out.println("outer_private = "
							+ outer_private);
		}
	}
}

public class InnerClass {
	public static void main(String[] args)
	{
		OuterClass outerObject = new OuterClass();
	
		OuterClass.InnerClass2 innerObject
			= outerObject.new InnerClass2();

		innerObject.display();
	}
}

