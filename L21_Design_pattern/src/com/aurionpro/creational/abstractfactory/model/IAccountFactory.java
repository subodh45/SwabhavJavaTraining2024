package com.aurionpro.creational.abstractfactory.model;


public interface IAccountFactory {

	IAccount getAccount(int accountNumber,String name ,int balance ,int minBalance);
}
