package com.aurionpro.behaviour.state.test;
import com.aurionpro.behaviour.state.model.*;

public class PacketTest {
public static void main(String[] args) {
	
	Packet packet = new Packet(new Ordered());
	
	packet.currentState();
	
   packet.gotoNextState();
   packet.currentState();
   packet.gotoNextState();
   packet.currentState();
   packet.gotoNextState();
   packet.currentState();
   
}
}
