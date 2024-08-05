package comp.Aurionpro.Homework;

import java.util.*;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter time in minutes ");
		int time = sc.nextInt();
		
		
		int hours = time / 60;
		int minutes = time%60;
		
		System.out.println("time :"+ time);
		System.out.println("Hours : "+ hours + " and minutes :"+ minutes );
		
	}

}
