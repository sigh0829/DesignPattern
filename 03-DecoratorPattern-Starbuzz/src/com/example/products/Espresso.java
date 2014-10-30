package com.example.products;

import com.example.abstractclass.Beverage;

public class Espresso extends Beverage{

	public Espresso(){
		description = "Expresso";
	}
	
	@Override
	public double cost(){
		return 1.99;
	}
}
