package com.aurionpro.structural.composite.test;
import com.aurionpro.structural.composite.model.*;

public class TaskTest {
public static void main(String[] args) {

	   // Creating leaf
    ITask simpleTask1 = new SimpleTaskLeaf("Complete Coding");
    ITask simpleTask2 = new SimpleTaskLeaf("Write Documentation");

    System.out.println("Leaf Node ");
    simpleTask1.display();
    
    // Creating compositor
    TaskListComposite projectTasks = new TaskListComposite("Project Tasks");
    projectTasks.addTask(simpleTask1);
    projectTasks.addTask(simpleTask2);

    // Nested task list
    TaskListComposite phase1Tasks = new TaskListComposite("Composite  Tasks");
    phase1Tasks.addTask(new SimpleTaskLeaf("Design"));
    phase1Tasks.addTask(new SimpleTaskLeaf("Implementation"));

    

    // Displaying tasks
    System.out.println("Composite Node ");
    projectTasks.display();
}
}
