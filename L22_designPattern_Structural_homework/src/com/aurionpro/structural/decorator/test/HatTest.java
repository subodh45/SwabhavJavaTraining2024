package com.aurionpro.structural.decorator.test;
import com.aurionpro.structural.decorator.model.*;
public class HatTest {

	public static void main(String[] args) {
		
		IHat hat = new StandardHat();
		System.out.println(hat.getName() + hat.getPrice());
		
		GoldenHat Goldhat= new GoldenHat(hat);		
		System.out.println(Goldhat.getName() + Goldhat.getPrice());
		
		RibbonHat ribbonHat = new RibbonHat(hat);
		System.out.println(ribbonHat.getName() + ribbonHat.getPrice());
		
		RibbonHat ribbonHat2 = new RibbonHat(Goldhat);
		System.out.println(ribbonHat2.getName() + ribbonHat2.getPrice());
		
		
		IHat Hat = new PremiumHat();
		System.out.println(Hat.getName() + Hat.getPrice());
		
		GoldenHat Goldhat2= new GoldenHat(Hat);		
		System.out.println(Goldhat2.getName() + Goldhat2.getPrice());
		
		RibbonHat ribbonHat3 = new RibbonHat(Hat);
		System.out.println(ribbonHat3.getName() + ribbonHat3.getPrice());
		
		RibbonHat ribbonHat4 = new RibbonHat(Goldhat2);
		System.out.println(ribbonHat4.getName() + ribbonHat4.getPrice());
		
		
		
	}
}
