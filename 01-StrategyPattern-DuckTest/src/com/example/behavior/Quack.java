package com.example.behavior;

import com.example.behaviorinterface.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack!Quack!Quack!");
		
	}

}
