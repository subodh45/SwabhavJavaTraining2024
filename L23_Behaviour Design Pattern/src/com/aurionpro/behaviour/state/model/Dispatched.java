package com.aurionpro.behaviour.state.model;

public class Dispatched implements IPacketState {

	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Going into delivered state.");
		packet.setState(new Delivered());
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("going to Ordered state .");
		packet.setState(new Ordered());
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("current state is dispatched.");
	}
}
