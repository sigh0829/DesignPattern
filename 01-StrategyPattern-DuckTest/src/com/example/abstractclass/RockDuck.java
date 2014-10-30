package com.example.abstractclass;

import com.example.behaviorinterface.FlyBehavior;
import com.example.behaviorinterface.QuackBehavior;

public class RockDuck extends Duck implements FlyBehavior, QuackBehavior{

	public RockDuck(){
		flyBehavior = this;
		quackBehavior = this;
	}
	
	@Override
	public void display() {
		System.out.println("I am a rock duck!!");
	}

	@Override
	public void quack() {
		System.out.println("Rock Quack");
		
	}

	@Override
	public void fly() {
		System.out.println("Rock Fly");
		
	}

}
