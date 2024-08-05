package com.aurionpro.behaviour.Stratergy.model;

public class OperationStratergy {

	IOperation opeartion;

	public OperationStratergy(IOperation opeartion) {
		super();
		this.opeartion = opeartion;
	}

	public IOperation getOpeartion() {
		return opeartion;
	}

	public void setOpeartion(IOperation opeartion) {
		this.opeartion = opeartion;
	}
	
	
	public int doOperation(int a,int b) {
		return opeartion.doOperation(a, b);
	}
}
