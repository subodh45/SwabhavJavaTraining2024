package com.aurionpro.behaviour.state.model;

public class Delivered implements IPacketState{

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is already delivered.");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("moving to ordered state.");
		packet.setState(new Dispatched());
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Current state is delivered.");
	}

	
}
