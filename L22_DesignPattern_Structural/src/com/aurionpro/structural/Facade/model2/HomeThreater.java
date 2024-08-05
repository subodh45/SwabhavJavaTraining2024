package com.aurionpro.structural.Facade.model2;

import java.util.Scanner;

public class HomeThreater  {
 
	 Scanner scanner;
	
	DVDPlayer dvd = new DVDPlayer();
	Projector projector = new Projector();
	SoundSystem soundsystem = new SoundSystem();
	
	
	public void movieStart()
	{
		dvd.DVDOn();
		dvd.DVDstart();
		projector.ProjectorOn();
		projector.ProjectorInput();
		soundsystem.SoundSystemStart();
		scanner = new Scanner(System.in);
		System.out.println("Set Sound level ");
		int level = scanner.nextInt();
		soundsystem.SoundSystemVolume( level);
		
		System.out.println("Movie Started .");
		
	}
	
	public void movieOff()
	{
		dvd.DVDstop();
		dvd.DVDoff();
		projector.ProjectorOff();
		soundsystem.SoundSystemStop();
		
		System.out.println("Movie Stop.");
	}

	
}
