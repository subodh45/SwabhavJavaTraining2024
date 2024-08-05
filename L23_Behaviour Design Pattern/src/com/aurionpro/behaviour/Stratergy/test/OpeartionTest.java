package com.aurionpro.behaviour.Stratergy.test;
import com.aurionpro.behaviour.Stratergy.model.*;

public class OpeartionTest {
public static void main(String[] args) {
	
	OperationStratergy operation = new OperationStratergy(new AddOperation());
	
	System.out.println( operation.doOperation(10, 20) );
	
	operation.setOpeartion(new MulOperation());
	operation.doOperation(10, 20);
}
}
