package com.aurionpro.structural.Facade.model2;

public class SoundSystem implements ISoundSystem {

	@Override
	public void SoundSystemStart() {
		// TODO Auto-generated method stub
		System.out.println("Sound System Started ");
	}

	@Override
	public void SoundSystemStop() {
		// TODO Auto-generated method stub
		System.out.println("Sound System stop.");
	}  

	@Override
	public void SoundSystemVolume(int level) {
		// TODO Auto-generated method stub
		System.out.println("sound chnge to "+ level);
	}

	
	
}
