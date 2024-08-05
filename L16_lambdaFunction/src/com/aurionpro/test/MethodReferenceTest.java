package com.aurionpro.test;

import com.aurionpro.model.Ireference;
import com.aurionpro.model.Reference;

public class MethodReferenceTest {
	
	public static void main(String[] args) {
		
		Ireference Itest = Reference :: new;
		display(Itest);
		
		Ireference Itest2 = Reference ::StaticPrint;
		display(Itest2);
		
		Reference reference = new Reference();
		Ireference Itest3 = reference ::NonstaticPrint;
		display(Itest3);
		
		
	}

	private static void display(Ireference itest) {
		// TODO Auto-generated method stub
		itest.show();
	}

}
