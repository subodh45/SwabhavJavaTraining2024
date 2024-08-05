package com.aurionpro.violation.test;
import com.aurionpro.violation.model.*;

public class WorkerTest {
public static void main(String[] args) {
	
	IWorker worker = new Labour();
	System.out.println("Labour Working ");
	worker.drink();
	worker.eat();
	worker.startWork();
	worker.stopWork();
	
	//super class reference can be used  on subclass
	System.out.println("Robot working .");
	worker = new Robot();
	worker.drink();
	worker.eat();
	worker.startWork();
	worker.stopWork();	
}
}
