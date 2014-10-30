package com.example.condiment;

import com.example.abstractclass.Beverage;
import com.example.abstractclass.CondimentDecorator;

public class Whip extends CondimentDecorator{
	private Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
