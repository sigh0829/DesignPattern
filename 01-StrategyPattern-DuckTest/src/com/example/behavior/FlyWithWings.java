package com.example.behavior;

import com.example.behaviorinterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can fly now!!");
		
	}

}
