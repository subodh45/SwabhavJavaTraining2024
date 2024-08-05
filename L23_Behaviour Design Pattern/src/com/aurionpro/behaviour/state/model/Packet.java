package com.aurionpro.behaviour.state.model;

public class Packet  {

	IPacketState state;

	public Packet(IPacketState state) {
		super();
		this.state = state;
	}
	
	public IPacketState getState() {
		return state;
	}

	public void setState(IPacketState state) {
		this.state = state;
	}

	public void gotoNextState()
	{
		state.next(this);
	}
	
	public void gotoPreviousState()
	{
		state.previous(this);
	}
	
	public void currentState()
	{
		state.current(this);
	}
}
