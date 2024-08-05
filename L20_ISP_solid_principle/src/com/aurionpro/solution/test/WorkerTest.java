package com.aurionpro.solution.test;
import com.aurionpro.solution.model.*;

public class WorkerTest {
public static void main(String[] args) {
	
	IWorker labour = new Labour();
	
	labour.drink();
	labour.eat();
	labour.startWork();
	labour.stopWork();
	
	Robot robot = new Robot();
	robot.startWork();
	robot.stopWork();
}
}
