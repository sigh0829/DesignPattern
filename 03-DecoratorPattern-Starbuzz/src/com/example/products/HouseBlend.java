package com.example.products;

import com.example.abstractclass.Beverage;

public class HouseBlend extends Beverage{

	public HouseBlend(){
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}
	
}
