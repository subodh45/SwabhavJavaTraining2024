package com.aurionpro.behaviour.state.model;

public class Ordered implements IPacketState {

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Going into dispatched state.");
		packet.setState(new Dispatched());
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("in Ordered state only.");
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("current state is ordered.");
	}

}
